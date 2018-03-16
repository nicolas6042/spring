package com.domain.patterns.prototype.library;

import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * @author mbaranowicz
 */
public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        BookList booksAvailable = new BookList("Avaliable Books");
        IntStream.iterate(1, n -> n + 2)
                .limit(10)
                .forEach(n -> booksAvailable.getBooks().add(new Book("Title " + n, "Author " + n, LocalDate.now().plusDays(n))));

        BookList booksRented = new BookList("Rented Books");
        IntStream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(n -> booksRented.getBooks().add(new Book("Titlee " + n, "Authorr " + n, LocalDate.now().minusDays(n))));

        Library library = new Library("Library no. 1");
        library.getBooks().add(booksAvailable);
        library.getBooks().add(booksRented);

        Library libraryCloned = null;
        try{
            libraryCloned=library.shallowCopy();
            libraryCloned.setName("Library no. 2");
        }catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        Library libraryDeepCloned = null;
        try {
            libraryDeepCloned=library.deepCopy();
            libraryDeepCloned.setName("Library no. 3");
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //When
        library.getBooks().remove(booksRented);
        //Then

        System.out.println(library);
        System.out.println(libraryCloned);
        System.out.println(libraryDeepCloned);

        assertEquals(1,library.getBooks().size());
        assertEquals(1,libraryCloned.getBooks().size());
        assertEquals(2,libraryDeepCloned.getBooks().size());
        assertEquals(library.getBooks(),libraryCloned.getBooks());
        assertNotEquals(libraryDeepCloned.getBooks(),library.getBooks());
    }
}
