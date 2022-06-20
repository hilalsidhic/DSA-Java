package com.hilal;
//29.
//        *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *
public class q29 {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 0; i < row*2; i++) {
            int totalcol = i>row?row*2-i:i;
            int whitespace = row*2-totalcol*2;
            for (int j = 0; j < totalcol; j++) {
                System.out.print("*");
            }
            for (int k = 0; k <whitespace ; k++) {
                System.out.print(" ");
            }
            for (int l = 0; l < totalcol; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
