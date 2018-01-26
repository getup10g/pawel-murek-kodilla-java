package com.kodilla.sudoku.data;

public class Board {
    protected static SudokuRow[] board = new SudokuRow[10];
    protected static SudokuBlock[] blocks = new SudokuBlock[10];

    public Board() {
        for (int n = 0; n < 9; n++) {
            board[n] = new SudokuRow();
            blocks[n] = new SudokuBlock();
        }
    }
    public static SudokuRow[] getBoard() {
        return board;
    }
    public static SudokuBlock[] getBlocks() {
        return blocks;
    }
    @Override
    public String toString() {
        String result = "    1   2   3   4   5   6   7   8   9"+"\n";
        for(int n = 0; n < 9; n++) {
            result += 1+n+" |";

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
