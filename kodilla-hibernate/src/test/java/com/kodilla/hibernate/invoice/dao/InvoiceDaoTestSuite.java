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

        Item item1 = new Item(new BigDecimal("8"),1,new BigDecimal("200"));
        Item item2 = new Item(new BigDecimal("8"),1,new BigDecimal("200"));

        Invoice testInvoice1 = new Invoice("123");

        nutella.getItems().add(item1);
        nutella.getItems().add(item2);

        testInvoice1.getItems().add(item1);
        testInvoice1.getItems().add(item1);

       item1.setInvoice(testInvoice1);
       item2.setInvoice(testInvoice1);
       item1.setProduct(nutella);
       item1.setProduct(nutella);


        //When
        invoiceDao.save(testInvoice1);
        int testInvoice1Id = testInvoice1.getId();

        //Then
        Assert.assertNotEquals(0, testInvoice1Id);


        //CleanUp
        try {
            invoiceDao.delete(testInvoice1Id);

        } catch (Exception e) {
            //do nothing
        }
    }
}
