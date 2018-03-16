package com.domain.exception.nullpointer;

/**
 * @author mbaranowicz
 */
public class NullPointerExceptionRunner {

    public static void main(String []args){
        User user = null;

        MessageSender messageSender = new MessageSender();
        try {
            messageSender.sendMessageTo(user, "Siema");
        } catch (MessageNotSentException e) {
            System.out.println("Still running");
        }

        System.out.println("Still runnning");
    }
}
