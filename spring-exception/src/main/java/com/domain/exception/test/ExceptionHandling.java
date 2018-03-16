package com.domain.exception.test;

/**
 * @author mbaranowicz
 */
public class ExceptionHandling {

    public static void main(String []args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(3.0,5.4);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception " + e);
        }finally {
            System.out.println("Thanks");
        }
    }
}
