package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Author 1", "Title 1", 2005, "1"));
        bookSet.add(new Book("Author 2", "Title 2", 2010, "2"));
        bookSet.add(new Book("Author 3", "Title 3", 2015, "3"));

        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int median = medianAdapter.publicationYearMedian(bookSet);
        //Then
        assertEquals(2010, median);
    }
}
