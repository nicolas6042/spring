package com.domain.exception.test;

/**
 * @author mbaranowicz
 */
public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException();
        }
        return a/b;
    }

    public static void main(String[] args){
        FirstChallenge firstChallenge = new FirstChallenge();
        try {
            double result = firstChallenge.divide(3,0);
            System.out.println(result);

        } catch (ArithmeticException e){
            System.out.println("Exception");
        } finally {
            System.out.println(" Finally ");
        }


    }
}
