package com.hilal.Backtracking;

public class NQueens {
    public static void main(String[] args) {
//        boolean[][] maze = {{false,false,false,false},{false, false, false,false},{false,false,false,false},{false,false,false,false}};
        System.out.println(count(new boolean[5][5],0));
    }
    public static int count(boolean[][] board,int row){
        if(row==board.length){
            display(board);
            return 1;
        }
        int count = 0;
        for (int i = 0; i < board[0].length; i++) {
            if(!check(board,row,i)){
                board[row][i] = true;
                count += count(board,row+1);
                board[row][i] = false;
            }
        }
        return count;
    }

    private static boolean check(boolean[][] board, int row, int i) {
        if(board[row][i])
            return true;
        int minleft = Math.min(row,i);
        for (int j = row; j >=0; j--) {
            if (board[j][i])
                return true;
        }
        for (int j = 1; j <= minleft; j++) {
            if (board[row-j][i-j])
                return true;
        }
        int minright = Math.min(row,board.length-i-1);
        for (int j = 1; j <= minright; j++) {
            if (board[row-j][i+j])
                return true;
        }
        return false;
    }

    private static void display(boolean[][] board) {
        for (boolean[] num : board) {
            for (boolean element : num) {
                if (element){
                    System.out.print("Q ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

}
