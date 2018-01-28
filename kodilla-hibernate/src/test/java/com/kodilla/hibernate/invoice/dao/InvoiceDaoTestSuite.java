package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import com.kodilla.hibernate.manytomany.Company;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoice(){
        //Given
        Product nutella = new Product("Nutella");
        Product butter = new Product("Butter");
        Product milk = new Product("milk");
        Item item1 = new Item(nutella,new BigDecimal("8"),1,new BigDecimal("200"));
        Item item2 = new Item(butter,new BigDecimal("7.5"),1,new BigDecimal("100"));
        Item item3 = new Item(milk,new BigDecimal("2"),1,new BigDecimal("1000"));

        Invoice testInvoice1 = new Invoice("123");
        Invoice testInvoice2 = new Invoice("124");
        Invoice testInvoice3 = new Invoice("125");

        testInvoice1.getItems().add(item1);
        testInvoice1.getItems().add(item1);
        testInvoice2.getItems().add(item2);
        testInvoice3.getItems().add(item3);

        nutella.getItems().add(item1);
        butter.getItems().add(item2);
        milk.getItems().add(item3);

        item1.getInvoiceList().add(testInvoice1);
        item1.getInvoiceList().add(testInvoice1);
        item2.getInvoiceList().add(testInvoice2);
        item3.getInvoiceList().add(testInvoice3);

        //When
        invoiceDao.save(testInvoice1);
        int testInvoice1Id = testInvoice1.getId();
        invoiceDao.save(testInvoice2);
        int testInvoice2Id = testInvoice2.getId();
        invoiceDao.save(testInvoice3);
        int testInvoice3Id = testInvoice3.getId();

        //Then
        Assert.assertNotEquals(0, testInvoice1Id);
        Assert.assertNotEquals(0, testInvoice2Id);
        Assert.assertNotEquals(0, testInvoice3Id);

        //CleanUp
        try {
            invoiceDao.delete(testInvoice1Id);
            invoiceDao.delete(testInvoice2Id);
            invoiceDao.delete(testInvoice3Id);
        } catch (Exception e) {
            //do nothing
        }
    }
}
