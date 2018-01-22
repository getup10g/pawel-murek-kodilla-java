package com.kodilla.sudoku.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static com.kodilla.sudoku.data.Text.getMENU_TEXT;

public class Menu {

    public void makeChoice() {
        System.out.println(getMENU_TEXT());
        Scanner reading = new Scanner(System.in);
        System.out.println("\n");
        String choice = reading.next();
        List<String> choiceList = new ArrayList<>(Arrays.asList("sudoku","x","n"));
        Shoot shoot = new Shoot();

        if (choiceList.contains(choice)) {
            switch (choice) {
                case "sudoku":
                    shoot.sudoku();
                    break;
                case "x":
                    System.out.println("Do you want exit?  yes/no");
                    System.out.println("\n");
                    choice=reading.next();
                    if(choice.equals("yes")){
                        shoot.exit();
                    } else shoot.donothing();
                    break;
                case "n":
                    System.out.println("Do you want repeat?  yes/no");
                    System.out.println("\n");
                    choice=reading.next();
                    if(choice.equals("yes")){
                        shoot.repeat();
                    } else shoot.donothing();
                    break;
                }
            }else if(choice.length()==3&&choice.length()==6) {
            for (int i = 0; i < choice.length(); i++) {
                int j = Character.digit(choice.charAt(i), 10);
                if (j > 0 && j <= 9) {
                    System.out.println("digit: " + j);
                    shoot.getShoot().add(j);
                } else shoot.donothing();
            }
            }else
            shoot.donothing();
    }
}


