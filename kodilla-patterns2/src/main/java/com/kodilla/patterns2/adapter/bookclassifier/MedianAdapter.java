package com.kodilla.patterns2.adapter.bookclassifier;


import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {


    @Override
    public int publicationYearMedian(Set<com.kodilla.patterns2.adapter.bookclassifier.librarya.Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book> map = new HashMap<>();
        bookSet.forEach(t -> map.put(new BookSignature(t.getSignature()), new com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book(t.getAuthor(),t.getTitle(),t.getPublicationYear())));
        return medianPublicationYear(map);
    }
}
