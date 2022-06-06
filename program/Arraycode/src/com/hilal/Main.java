package com.hilal;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr;
        arr=new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i]=(i+1)*9;
        }
        for (int val:arr) {
            System.out.print(val+" ");
        }
        String[] arr2 = {"hilal", "this"};
        System.out.println(Arrays.toString(arr2));
    }
}