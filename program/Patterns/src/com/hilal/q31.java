package com.hilal;
//31.     4 4 4 4 4 4 4
//        4 3 3 3 3 3 4
//        4 3 2 2 2 3 4
//        4 3 2 1 2 3 4
//        4 3 2 2 2 3 4
//        4 3 3 3 3 3 4
//        4 4 4 4 4 4 4
public class q31 {
    public static void main(String[] args) {
        int row =7 ;
        for (int i = 0; i < row; i++) {
            int col = row;
            for (int j = 0; j < col; j++) {
                int up = i;
                int down = col-i-1;
                int left = j;
                int right = row- j-1;
                int min=Math.min(Math.min(up,down),Math.min(right,left));
                int num = row/2 -min+1;
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
