package com.domain.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

/**
 * @author mbaranowicz
 */
public class Library extends Prototype {
    private String name;
    private Set<BookList> Books = new HashSet<>();


    public Library(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<BookList> getBooks() {
        return Books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", Books=" + Books +
                '}';
    }

    public Library shallowCopy() throws CloneNotSupportedException{
        return (Library) super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException{
        Library clonedLibrary = (Library) super.clone();
        clonedLibrary.Books = new HashSet<>();
        for (BookList bookList: Books) {
         BookList clonedBooks = new BookList(bookList.getName());
            for (Book book: bookList.getBooks()) {
                clonedBooks.getBooks().add(book);
            }
            clonedLibrary.getBooks().add(clonedBooks);
        }
        return clonedLibrary;
    }
}
