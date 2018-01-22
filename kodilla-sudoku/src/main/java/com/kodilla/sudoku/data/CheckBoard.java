package com.kodilla.sudoku.data;

import static com.kodilla.sudoku.data.Board.blocks;
import static com.kodilla.sudoku.data.Board.getBoard;

public class CheckBoard {
    public boolean checkBoardSetValue(int x,int y,int value){
        boolean isValueRepeated=false;
        if(x<=9&&y<=9&&value<=9) {
            for (int n = 0; n < 9; n++) {
                if (getBoard()[x].getSudokuElements().get(n).getValue() == value) {
                    isValueRepeated = true;
                }
            }
            for (int n = 0; n < 9; n++) {
                if (getBoard()[n].getSudokuElements().get(x).getValue() == value) {
                    isValueRepeated = true;
                }
            }

            if (x <= 2 && y <= 2) {
                if (blocks[0].getPossibleValues().contains(value)) {
                    isValueRepeated = true;
                }else {
                    blocks[0].getPossibleValues().add(value);
                }
            }
            if (x > 2 && x <= 5 && y <= 2) {
                if (blocks[1].getPossibleValues().contains(value)) {
                    isValueRepeated = true;
                }else {
                    blocks[1].getPossibleValues().add(value);
                }
            }
            if (x > 2 && x <= 8 && y <= 2) {
                if (blocks[2].getPossibleValues().contains(value)) {
                    isValueRepeated = true;
                }else {
                    blocks[2].getPossibleValues().add(value);
                }
            }
            if (x <= 2 && y <= 5 && y > 2) {
                if (blocks[3].getPossibleValues().contains(value)) {
                    isValueRepeated = true;
                }else {
                    blocks[3].getPossibleValues().add(value);
                }
            }
            if (x > 2 && x <= 5 && y <= 5 && y > 2) {
                if (blocks[4].getPossibleValues().contains(value)) {
                    isValueRepeated = true;
                }else {
                    blocks[4].getPossibleValues().add(value);
                }
            }
            if (x > 5 && x <= 8 && y <= 5 && y > 2) {
                if (blocks[5].getPossibleValues().contains(value)) {
                    isValueRepeated = true;
                }else {
                    blocks[5].getPossibleValues().add(value);
                }
            }
            if (x <= 2 && y <= 8 && y > 5) {
                if (blocks[6].getPossibleValues().contains(value)) {
                    isValueRepeated = true;
                }else {
                    blocks[6].getPossibleValues().add(value);
                }
            }
            if (x <= 2 && x < 5 && y <= 8 && y > 5) {
                if (blocks[7].getPossibleValues().contains(value)) {
                    isValueRepeated = true;
                }else {
                    blocks[7].getPossibleValues().add(value);
                }
            }
            if (x < 5 && x <= 8 && y <= 8 && y > 5) {
                if (blocks[8].getPossibleValues().contains(value)) {
                    isValueRepeated = true;
                }else {
                    blocks[8].getPossibleValues().add(value);
                }
            }
        }
        if (!isValueRepeated) {
            getBoard()[y].getSudokuElements().get(x).setValue(value);
        }
        return isValueRepeated;
    }
}
