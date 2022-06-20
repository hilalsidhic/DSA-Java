package com.hilal;
//       1 2 3 4  17 18 19 20
//         5 6 7  14 15 16
//           8 9  12 13
//             10 11
public class q27 {
    public static void main(String[] args) {
        int totalnum=0,newnum;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 4-i; j++) {
                totalnum++;
                System.out.print(totalnum+" ");
            }
            newnum = 20-totalnum;
            for (int j = 4; j > i ; j--) {
                newnum++;
                System.out.print(newnum+" ");
            }
            System.out.println();
        }
    }
}
