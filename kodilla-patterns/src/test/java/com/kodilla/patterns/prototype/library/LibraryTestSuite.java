package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite{
    @Test
    public void testGetBooks(){
        //given
        //creating Library
        Library homeLibrary = new Library("Home Library");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> homeLibrary.getBooks().add(new Book("Pan Tadeusz tom"+n,"Adam Mickiewicz", LocalDate.now())));

        Library clonedHomeLibrary = null;
        try {
            clonedHomeLibrary = homeLibrary.shallowCopy();
            clonedHomeLibrary.setName("Home Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

       Library deepClonedHomeLibrary= null;
        try {
            deepClonedHomeLibrary = homeLibrary.deepCopy();
            deepClonedHomeLibrary.setName("Home Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        System.out.println(homeLibrary);
        System.out.println(clonedHomeLibrary);
        System.out.println(deepClonedHomeLibrary);
        Assert.assertEquals(10, homeLibrary.getBooks().size());
        Assert.assertEquals(10, clonedHomeLibrary.getBooks().size());
        Assert.assertEquals(10, deepClonedHomeLibrary.getBooks().size());
        Assert.assertEquals(clonedHomeLibrary.getBooks(), homeLibrary.getBooks());
        Assert.assertEquals(deepClonedHomeLibrary.getBooks(), homeLibrary.getBooks());
    }


}
