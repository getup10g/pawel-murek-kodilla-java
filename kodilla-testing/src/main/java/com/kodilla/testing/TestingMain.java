package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();
        int add = calculator.add(5,5);
        int substract = calculator.substract(5,5);
        if(add==10&&substract==0){
            System.out.println("calculator test OK");
        } else {
            System.out.println("Error!");
        }

    }
}