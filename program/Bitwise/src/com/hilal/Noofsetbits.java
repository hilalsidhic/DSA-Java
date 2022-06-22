package com.hilal;

public class Noofsetbits {

    public static void main(String[] args) {
        int num = 16;
        System.out.println(Integer.toBinaryString(num));
        int count = 0;
        while (num > 0) {
            if ((num & 1) == 1)
                count++;
            num = num >> 1;
        }
        System.out.println(count);
    }
}
