package com.kodilla.sudoku.app;

import com.kodilla.sudoku.data.Board;
import com.kodilla.sudoku.data.FillingBoard;
import com.kodilla.sudoku.data.Menu;

import static com.kodilla.sudoku.data.Text.getLOGO;

public class SudokuGame {
    protected static int userChoice=2;

    public static void setUserChoice(int userChoice) {
        SudokuGame.userChoice = userChoice;
    }

    public static int getUserChoice() {
        return userChoice;
    }


    private boolean resolveSudoku() {
        Menu menu = new Menu();
        Board board = new Board();
        FillingBoard fillingBoard = new FillingBoard();
        while (getUserChoice() != 0) {
            //menu.makeChoice();
            fillingBoard.randomFilling(7);
            System.out.println(board.toString());
            switch (getUserChoice()) {
                case 1:

                    break;
                case 2:
                    while (getUserChoice() == 2) {
                        menu.makeChoice();
                    }
                    break;
                case 3:

                case 6:

                    break;
                case 5:

                    break;
            }
        }
        return false;

    }

    public static void main(String[] args){
        System.out.println(getLOGO());
        boolean gameFinished = false;
        while(!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            gameFinished = theGame.resolveSudoku();
        }
    }


}
