package com.hilal.Backtracking;

public class Sudoku {
    public static void main(String[] args) {
        int[][] board = {{0, 4, 0, 0, 0, 2, 0, 0, 0},
                         {0, 0, 8, 4, 7, 0, 0, 0, 5},
                         {0, 0, 0, 0, 0, 6, 0, 7, 0},
                         {0, 6, 0, 9, 1, 0, 0, 5, 0},
                         {3, 0, 0, 0, 0, 0, 0, 0, 8},
                         {0, 0, 0, 0, 0, 7, 0, 0, 0},
                         {0, 9, 0, 5, 4, 0, 0, 1, 0},
                         {0, 0, 6, 0, 0, 0, 9, 0, 0},
                         {0, 0, 0, 2, 0, 0, 0, 0, 0}};
        if(check(board,0,0)){
            display(board);
        }
        else
            System.out.println("Not Valid");

    }
    public static boolean check(int[][] board,int row,int col){
        row = -1;
        col = -1;
        boolean isnotComplete = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j]==0){
                    row = i;
                    col = j;
                    isnotComplete = true;
                    break;
                }
            }
            if (isnotComplete)
                break;
        }
        Character.compare()
        if (isnotComplete){
            for (int i = 1; i <= 9; i++) {
                if (isValid(board,row,col,i)){
                    board[row][col]=i;
                    if (check(board,row,col)){
                        return true;
                    }
                    else {
                        board[row][col]=0;
                    }
                }
            }
        }
        else {
            return true;
        }
        return false;
    }

    private static void display(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isValid(int[][] board,int row,int col,int target) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][col]==target)
                return false;
        }
        for (int i = 0; i < board[0].length; i++) {
            if (board[row][i]==target)
                return false;
        }
        int sqrt = (int)Math.sqrt(board.length);
        int minRow = row - row%sqrt;
        int minCol = col - col%sqrt;
        for (int i = minRow; i < minRow + sqrt; i++) {
            for (int j = minCol; j < minCol + sqrt; j++) {
                if (board[i][j]==target)
                    return false;
            }
        }
        return true;
    }
}
