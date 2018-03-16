package com.domain.patterns.prototype.library;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mbaranowicz
 */
public class BookList {

    private final String name;

    private final List<Book> books = new ArrayList<>();

    public BookList(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "BookList{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
}
