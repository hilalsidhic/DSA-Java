package com.hilal;

public class Findduplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,4,5,4} ;
        System.out.println(findunique(arr));
    }

    private static int findunique(int[] arr) {
        int unique = 0;
        for (int num:arr) {
            unique = unique^num;
        }
        return unique;
    }
}
