package com.hilal;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        for (int i=0,j=arr.length-1;i<j;i++,j--){
            swap(arr,i,j);
        }
    }
    static void swap(int[] arr,int a , int b){
        int temp = arr[a];
        arr[a]= arr[b];
        arr[b]= temp;
    }
}
