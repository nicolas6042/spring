package com.domain.exception.nullpointer;

/**
 * @author mbaranowicz
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
