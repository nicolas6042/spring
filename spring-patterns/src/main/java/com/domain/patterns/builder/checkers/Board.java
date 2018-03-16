package com.domain.patterns.builder.checkers;

import java.util.Arrays;

/**
 * @author mbaranowicz
 */
public class Board {
    public final static int MIN_INDEX = 0;
    public final static int MAX_INDEX = 9;
    Figure[][] board = new Figure[10][];

    public Board() {
        for (int i = 0; i <10 ; i++) {
            board[i] = new Figure[10];
        }
    }

    public Figure getFigure(int x, int y) {
        return board[x][y];
    }

    public void setFigure(Figure figure, int x, int y) {
        board[x][y] = figure;
    }

    @Override
    public String toString() {
       String result ="";
        for (int i = MIN_INDEX; i <= MAX_INDEX; i++) {
            result += "|";
            for (int j = MIN_INDEX; j <= MAX_INDEX ; j++) {
                if (board[i][j] == null){
                    result += " ";
                }else {
                    result +=(board[i][j]).getColor().equals(Figure.BLACK) ? "b":"w";
                    result +=(board[i][j]) instanceof Pawn ? "P" :"Q";
                }
                result +="|";
            }
            result+="\n";
        }
        return result;
    }
}
