package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //given
        Library library = new Library("Test library");
        Set<Book> books = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            library.getBooks().add(new Book("Test title " + i, "Test author " + i, LocalDate.of(1980 + i, 1 + i, 5 + i)));
        }

        //making a shallow copy of object library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Test library shallow copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Test library deep copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //when
        library.getBooks().add(new Book("Extra test title", "Extra author title", LocalDate.of(1999, 9, 29)));

        //then
        Assert.assertEquals(11, library.getBooks().size());
        Assert.assertEquals(11, clonedLibrary.getBooks().size());
        Assert.assertEquals(10, deepClonedLibrary.getBooks().size());
    }
}
