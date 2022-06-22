package com.hilal;

public class Findduplicates {
    public static void main(String[] args) {
        int[] arr = {2,2,8,4,5,4,4,5,2,5} ;
        System.out.println(findunique(arr));
    }

    private static int findunique(int[] arr) {
        int unique = 0;
        for (int num:arr) {
            unique = unique|num;
            System.out.println(unique);
        }
        return unique%3;
    }
}
