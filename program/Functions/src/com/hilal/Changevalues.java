package com.hilal;

import java.util.Arrays;

public class Changevalues {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int a=10;
        value(arr,a);
        System.out.println(Arrays.toString(arr));
        System.out.println("a= "+a);
    }

    static void value(int[] array,int a) {
        array[0]=99;
        a++;
    }
}

