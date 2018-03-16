package com.domain.exception.nullpointer;

/**
 * @author mbaranowicz
 */
public class MessageSender {
    public void sendMessageTo(User user, String message) throws MessageNotSentException {
        if (user != null) {
            System.out.println("Sending message: " + message + " to: " + user.getName());
        }
        throw new MessageNotSentException("Object User was null");
    }
}
