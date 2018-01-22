package com.kodilla.sudoku.data;

import com.kodilla.sudoku.app.SudokuGame;

import java.util.Random;

public class Board {
    public final static int MIN_INDEX = 0;
    public final static int MAX_INDEX = 9;
    protected static SudokuRow[] board = new SudokuRow[10];
    protected static SudokuBlock[] blocks = new SudokuBlock[10];
    CheckBoard checkBoard = new CheckBoard();
    private int randomNumber;
    private int randomValue;

    public Board() {
        for (int n = 0; n < 9; n++) {
            board[n] = new SudokuRow();
            blocks[n] = new SudokuBlock();
        }
    }
    public void randomFilling() {
        for (int n = 0; n < 9; n++) {
            int numbersInLine = 0;
            int numberOfTrying=0;
            while (numbersInLine < 3 && numberOfTrying<10) {
                for(int j=0;j<9;j++){
                    Random random = new Random();
                    randomValue = random.nextInt(9);
                    randomNumber = random.nextInt(9);
                    System.out.println("y "+n+" x "+j+" setting " + numberOfTrying+" value " + randomValue+" numbersInLine "+numbersInLine);
                    boolean isSaved = checkBoard.checkBoardSetValue(randomNumber, n, randomValue);
                    System.out.println(isSaved);
                    if(!isSaved) {
                        numbersInLine++;
                        break;
                    }
                    numberOfTrying++;


                }
            }
        }
        for (int n = 0; n < 9; n++) {
            for (int i = 0; i < blocks[n].getPossibleValues().size(); i++) {
                System.out.println("block " + n + " " + blocks[n].getPossibleValues().get(i));
            }
        }
    }


    public static SudokuRow[] getBoard() {
        return board;
    }

    @Override
    public String toString() {
        String result = "";
        for(int n = 0; n < 9; n++) {
            result += "|";

            for(int k = 0; k < 9; k++) {
                if(getBoard()[n].getSudokuElements().get(k).getValue() == -1) {
                    result += "   ";
                } else {
                    result += " ";
                    result += getBoard()[n].getSudokuElements().get(k).getValue();
                    result += " ";
                }
                result += "|";
            }
            result += "\n";
        }
        return result;
    }
}
