package com.domain.exception.nullpointer;

/**
 * @author mbaranowicz
 */
public class MessageNotSentException extends Exception {
    public MessageNotSentException(final String message){
        super(message);
    }
}
