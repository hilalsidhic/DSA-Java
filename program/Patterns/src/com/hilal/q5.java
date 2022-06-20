package com.hilal;
//5.      *
//        **
//        ***
//        ****
//        *****
//        ****
//        ***
//        **
//        *
public class q5 {
    public static void main(String[] args) {
        int row = 10;int k=0;
        for (int i = 1; i <= row; i++) {
            int col = i;
            if(i>row/2){
                k=k+2;
                col=col-k;
            }
            for (int j = 0; j < col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
