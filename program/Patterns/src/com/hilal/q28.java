package com.hilal;
//28.         *
//           * *
//          * * *
//         * * * *
//        * * * * *
//         * * * *
//          * * *
//           * *
//            *
public class q28 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i < n*2; i++) {
            int totalcol = i>n ? n*2-i:i;
            int whitespace = n- totalcol;
            for (int k = 0; k < whitespace; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < totalcol; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
