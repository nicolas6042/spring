package com.domain.spiringfirst.reader;

/**
 * @author mbaranowicz
 */
public class Reader {
    final Book book;

    public Reader(Book book) {
        this.book = book;
    }
    public void read(){
        System.out.println("Reading " + book.getTitle());
    }
}
