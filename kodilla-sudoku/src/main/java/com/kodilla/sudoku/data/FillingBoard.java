package com.kodilla.sudoku.data;

import java.util.ArrayList;
import java.util.Random;

import static com.kodilla.sudoku.data.Board.*;
import static java.util.Arrays.asList;

public class FillingBoard {
    private CheckBoard checkBoard = new CheckBoard();
    private int randomValue;
    Random random = new Random();
    protected static SudokuRow[] boardsList = new SudokuRow[10];
    protected static SudokuBlock[] blocksList = new SudokuBlock[10];

    public static SudokuRow[] getBoardsList() {
        return boardsList;
    }

    public static SudokuBlock[] getBlocksList() {
        return blocksList;
    }

    public void randomFilling(int number) {
        System.out.println("wait filling in progress");
        boolean isRepeated = false;
        int secondCounter = 0;
        linesloop:
        for (int numberOfLine = 0; numberOfLine < 9; numberOfLine++) {
            int counter = 0;

            int thirdCounter=0;

            levelsLoop:
            while (checkBoard.countNumbersInLine(numberOfLine) <= number) {

                columnesLoop:
                for (int numberOfColumne = 0; numberOfColumne < 9; numberOfColumne++) {
                        randomValue = random.nextInt(9);
                        while (randomValue < 1) {
                            randomValue = random.nextInt(9);
                        }
                        for (int i=0;i<100;i++){
                            isRepeated = checkBoard.checkBoardSetValue(numberOfColumne, numberOfLine, randomValue);
                            if(isRepeated){
                                i++;
                            } else{
                                break;
                            }
                        }
                        if(isRepeated){
                            for(int i=1;i<=9;i++){
                                isRepeated = checkBoard.checkBoardSetValue(numberOfColumne, numberOfLine, i);
                                if(!isRepeated){
                                    break;
                                }
                        }
                        if (!isRepeated) {
                            System.out.println("y " + numberOfLine + " x " + numberOfColumne + " value " + randomValue + " numbersInLine: " + checkBoard.countNumbersInLine(numberOfLine)+" isreapeated "+isRepeated);
                            break ;
                        }
                    }
                    if (isRepeated) {
                        counter++;
                       System.out.println("y " + numberOfLine + " x " + numberOfColumne + "counter " + counter  + " secondcounter " + secondCounter +" value " + randomValue + " numbersInLine: " + checkBoard.countNumbersInLine(numberOfLine));
                    }
                    if (checkBoard.countNumbersInLine(numberOfLine) == number) {
                        break levelsLoop;
                    }
                }

                if (counter > 100) {
                    for (int b = 0; b < 9; b++) {
                        checkBoard.setValue(b, numberOfLine, -1);
                    }
                    counter = 0;
                    secondCounter++;
                }
               if (secondCounter == 100 ) {
                        for (int b = 0; b < 9; b++) {
                            checkBoard.setValue(b, numberOfLine, -1);
                        }
                        if (numberOfLine > 0) {
                            numberOfLine = numberOfLine - 1;
                            for (int b = 0; b < 9; b++) {
                                checkBoard.setValue(b, numberOfLine, -1);
                            }
                            if (numberOfLine >= 1) {
                                numberOfLine = numberOfLine - 1;
                                for (int b = 0; b < 9; b++) {
                                    checkBoard.setValue(b, numberOfLine, -1);
                                }
                            }
                        }
                        secondCounter++;
                } else if (secondCounter == 150) {
                    for (int i=0;i<9;i++) {
                        for (int b = 0; b < 9; b++) {
                            checkBoard.setValue(b, i, -1);
                        }
                    }
                    numberOfLine=0;
                    secondCounter=0;
                }
            }

        }
        System.out.println("wait operation is almost finished");
    }
}










