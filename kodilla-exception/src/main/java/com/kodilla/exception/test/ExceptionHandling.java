package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try{
            System.out.println(secondChallenge.probablyIWillThrowException(1.5,4.2));
        }
        catch (Exception e){
            System.out.println("Values should be diffrent than  x >= 2 || x < 1 || y == 1.5");
        }
    }
}
