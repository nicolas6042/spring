package com.domain.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {

    @Test
    public void testListBooksWithConditionReturnList() {
        //Given
        LibraryDatabase libraryDatabase = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilberg Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabase.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        //When
        List<Book> theListOfBooks = bookLibrary.listBookWithCondition("Secret");

        //Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        //Given
        LibraryDatabase libraryDatabase = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabase.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
        when(libraryDatabase.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
        when(libraryDatabase.listBooksWithCondition("FourtyBooks")).thenReturn(resultListOf40Books);
        //When
        List<Book> theListOfBooks0 = bookLibrary.listBookWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBookWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBookWithCondition("FourtyBooks");
        //Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        //Given
        LibraryDatabase libraryDatabase = mock(LibraryDatabase.class);
        BookLibrary bookLibrary= new BookLibrary(libraryDatabase);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabase.listBooksWithCondition(anyString())).thenReturn(resultListOf10Books);
        //When
        List<Book> theListOfBooks10 = bookLibrary.listBookWithCondition("An");
        //Then
        assertEquals(0,theListOfBooks10.size());
        verify(libraryDatabase, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void testNoneBookInHandOf(){
        //Given
        LibraryDatabase libraryDatabase = mock(LibraryDatabase.class);
        LibraryUser libraryUser = new LibraryUser("John","Smith","32131231232");
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        List<Book> resultBooksInHandOf = new ArrayList<>();
        when(libraryDatabase.listBooksInHandOf(libraryUser)).thenReturn(resultBooksInHandOf);
        //When
        List<Book> theListOf0 = bookLibrary.listBooksInHandsOf(libraryUser);
        //Then
        assertEquals(0,theListOf0.size());
    }

    @Test
    public void testOneBookInHandOf(){
        //Given
        LibraryDatabase libraryDatabase = mock(LibraryDatabase.class);
        LibraryUser libraryUser = new LibraryUser("John","Smith","32131231232");
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        List<Book> resultBooksInHandOf = generateListOfNBooks(1);
        when(libraryDatabase.listBooksInHandOf(libraryUser)).thenReturn(resultBooksInHandOf);
        //When
        List<Book> theListOf1 = bookLibrary.listBooksInHandsOf(libraryUser);
        //Then
        assertEquals(1,theListOf1.size());
    }

    @Test
    public void test5BookInHandOf(){
        //Given
        LibraryDatabase libraryDatabase = mock(LibraryDatabase.class);
        LibraryUser libraryUser = new LibraryUser("John","Smith","32131231232");
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        List<Book> resultBooksInHandOf =generateListOfNBooks(5);
        when(libraryDatabase.listBooksInHandOf(libraryUser)).thenReturn(resultBooksInHandOf);
        //When
        List<Book> theListOf5 = bookLibrary.listBooksInHandsOf(libraryUser);
        //Then
        assertEquals(5,theListOf5.size());
    }

    public List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int i = 1; i <= booksQuantity; i++) {
            Book theBook = new Book("Title " + i, "Author " + i, 1970 + i);
            resultList.add(theBook);
        }
        return resultList;
    }
}
