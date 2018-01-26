package com.kodilla.sudoku.data;

import java.util.ArrayList;
import java.util.Random;

import static com.kodilla.sudoku.data.Board.board;
import static com.kodilla.sudoku.data.Board.getBlocks;
import static com.kodilla.sudoku.data.Board.getBoard;
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
        boolean isRepeated = false;

        linesloop:
        for (int numberOfLine = 0; numberOfLine < 9; numberOfLine++) {
            int counter = 0;
            int secondCounter = 0;

            ArrayList list = new ArrayList(asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

            levelsLoop:
            while (checkBoard.checkLine(numberOfLine) <= number) {

                columnesLoop:
                for (int numberOfColumne = 0; numberOfColumne < 9; numberOfColumne++) {

                    tryingLoop:
                    for (int numberOfTry = 0; numberOfTry < 100; numberOfTry++) {
                        randomValue = random.nextInt(9);
                        while (randomValue < 1) {
                            randomValue = random.nextInt(9);
                        }
                        isRepeated = checkBoard.checkBoardSetValue(numberOfColumne, numberOfLine, randomValue);
                        if (!isRepeated) {
                            break tryingLoop;
                        } else {
                            outerLoop:
                            for (int i = 1; i <= 9; i++) {
                                isRepeated = checkBoard.checkBoardSetValue(numberOfColumne, numberOfLine, i);
                                if (!isRepeated) {
                                    break tryingLoop;
                                }
                            }
                        }
                        if (isRepeated) {
                            counter++;
                            System.out.println("y " + numberOfLine + " x " + numberOfColumne + "counter " + counter + " linia " + numberOfLine + " secondcounter " + secondCounter + " value " + randomValue + " numbersInLine: " + checkBoard.checkLine(numberOfLine));
                        }
                        if (checkBoard.checkLine(numberOfLine) == number) {
                            break levelsLoop;
                        }
                    }
                }
                if (counter > 1000) {
                    for (int b = 0; b < 9; b++) {
                        checkBoard.setValue(b, numberOfLine, -1);
                    }
                    counter = 0;
                    secondCounter++;
                }
                if (secondCounter > 1000) {
                    if (numberOfLine > 0) {
                        numberOfLine--;
                        for (int b = 0; b < 9; b++) {
                            for (int z = 0; z < 9; z++) {
                                checkBoard.setValue(b, z, -1);
                            }
                        }
                    }
                    counter = 0;
                    secondCounter++;
                }
                if (secondCounter > 2000) {
                        break linesloop;
                }
                }
            }
        }
    }





