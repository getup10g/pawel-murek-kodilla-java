package com.kodilla.sudoku.data;

import java.util.ArrayList;

import static com.kodilla.sudoku.app.SudokuGame.setUserChoice;

public class Shoot {
    private ArrayList<Integer> shoot = new ArrayList<>();
    private ArrayList<String> decision = new ArrayList<>();
    public ArrayList<Integer> getShoot() {
        return shoot;
    }
    public void sudoku(){
        setUserChoice(3);
    }
    public void exit(){
        setUserChoice(0);
    }
    public  void repeat(){
        setUserChoice(1);
    }
    public  void donothing(){
        setUserChoice(2);
    }
    public ArrayList<String> getDecision() {
        return decision;
    }

    public void setShoot(ArrayList<Integer> shoot) {
        this.shoot = shoot;
    }
}
