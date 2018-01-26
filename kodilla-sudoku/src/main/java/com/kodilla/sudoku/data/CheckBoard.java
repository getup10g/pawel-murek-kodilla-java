package com.kodilla.sudoku.data;

import static com.kodilla.sudoku.data.Board.getBlocks;
import static com.kodilla.sudoku.data.Board.getBoard;
import static com.kodilla.sudoku.data.FillingBoard.getBoardsList;


public class CheckBoard {
    private boolean isValueRepeated=false;

    public boolean checkLevel(int y,int value){
        for (int n = 0; n < 9; n++) {
            if (value == getBoard()[y].getSudokuElements().get(n).getValue()) {
                isValueRepeated = true;
                break;
            }
        }

        return isValueRepeated;
    }
    public boolean checkVertical(int x,int value){
        for (int n = 0; n < 9; n++) {
            if (value == getBoard()[n].getSudokuElements().get(x).getValue()) {
                 isValueRepeated = true;
                 break;
            }
        }
        return isValueRepeated;
    }
    public boolean checkBlock(int number,int value){
        if(getBlocks()[number].getPossibleValues().contains(value)) {
            isValueRepeated=true;
        } else
            isValueRepeated = false;
        return isValueRepeated;
    }
    public boolean addToBlockList(int number,int value){
        return getBlocks()[number].getPossibleValues().add(value);
    }
    public boolean setValue(int x,int y,int value){
        getBoard()[y].getSudokuElements().get(x).setValue(value);
        return true;
    }
    public int checkLine(int numberOfLine) {
        int counter = 0;
        for (int n = 0; n < 9; n++) {
            if (getBoard()[numberOfLine].getSudokuElements().get(n).getValue() != -1) {
                counter++;
            }
        }
        return counter;
    }


    public boolean checkBoardSetValue(int x,int y,int value){
        isValueRepeated=true;
        boolean isPositionEmpty=getBoard()[y].getSudokuElements().get(x).getValue()==-1;
        isPositionEmpty=true; //cheatmode
        if(isPositionEmpty) {
            isValueRepeated=false;
            if(!checkLevel(y,value)) {
                if(!checkVertical(x,value)) {
                    if (x <= 2 && y <= 2) {
                        if (!checkBlock(0,value)) {
                            addToBlockList(0,value);
                            setValue(x,y,value);
                        }
                    }
                    if (x > 2 && x <= 5 && y <= 2) {
                        if (!checkBlock(1,value)) {
                            addToBlockList(1,value);
                            setValue(x,y,value);
                        }
                    }
                    if (x > 5 && x <= 8 && y <= 2) {
                        if (!checkBlock(2, value)) {
                            addToBlockList(2, value);
                            setValue(x, y, value);
                        }
                    }
                    if (x <= 2 && y <= 5 && y > 2) {
                        if (!checkBlock(3, value)) {
                            addToBlockList(3, value);
                            setValue(x, y, value);
                        }
                    }
                    if(x > 2 && x <= 5 && y <= 5 && y > 2) {
                        if (!checkBlock(4, value)) {
                            addToBlockList(4, value);
                            setValue(x, y, value);
                        }
                    }
                    if (x > 5 && y <= 5 && y > 2) {
                        if (!checkBlock(5, value)) {
                            addToBlockList(5, value);
                            setValue(x, y, value);
                        }
                    }
                    if (x <= 2 && y > 5) {
                        if (!checkBlock(6, value)) {
                            addToBlockList(6, value);
                            setValue(x, y, value);
                        }
                    }
                    if (x > 2 && x <= 5 && y > 5) {
                        if (!checkBlock(7, value)) {
                            addToBlockList(7, value);
                            setValue(x, y, value);
                        }
                    }
                    if (x > 5 && y > 5) {
                        if (!checkBlock(8, value)) {
                            addToBlockList(8, value);
                            setValue(x, y, value);
                        }
                    }
                }
            }
        }
        return isValueRepeated;
    }

}
