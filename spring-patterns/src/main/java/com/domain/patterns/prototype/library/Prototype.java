package com.domain.patterns.prototype.library;

/**
 * @author mbaranowicz
 */
public class Prototype<T> implements Cloneable {

    @Override
    public T clone() throws CloneNotSupportedException{
        return (T)super.clone();
    }
}
