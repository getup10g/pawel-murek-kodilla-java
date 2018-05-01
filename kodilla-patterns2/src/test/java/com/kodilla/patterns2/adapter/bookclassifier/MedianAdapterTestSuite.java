package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.company.SalaryAdapter;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void testPublicationYearMedian() {
        //given
        Book book1 = new Book("Tuwim","Wiersze",1845,"1");
        Book book2 = new Book("Tuwim","Wiersze",1845,"2");
        Book book3 = new Book("Tuwim","Wiersze",1845,"3");
        Set<Book> books = new HashSet<Book>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        MedianAdapter medianAdapter = new MedianAdapter();
        //when
        int median = medianAdapter.publicationYearMedian(books);
        //then
        System.out.println(median);
        assertEquals(median,1845,0);
    }
}
