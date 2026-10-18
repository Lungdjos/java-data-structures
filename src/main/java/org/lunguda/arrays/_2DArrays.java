package org.lunguda.arrays;

import java.util.Arrays;

public class _2DArrays {
    public _2DArrays(){
    }

    public void ticTacToe(){
        char[][] board = new char[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                // filling the array with empty box
                board[i][j] = ' ';
            }
        }
        System.out.print(Arrays.deepToString(board));

        // filling the values
        board[0][0] = 'X';
        board[1][1] = 'X';
        board[2][2] = 'X';
        System.out.print("\n"+Arrays.deepToString(board));

        // in-line definition of 2D arrays
        char[][] board2 = new char[][] {
                new  char[] {'X', 'O', 'X'},
                new  char[] {'O', 'X', 'O'},
                new  char[] {'X', 'O', 'X'},
        };
        System.out.print("\n"+Arrays.deepToString(board2));
    }
}
