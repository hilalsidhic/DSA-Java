package com.hilal;

import java.util.Arrays;

public class Insertionsort {
    public static void main(String[] args) {
        int[] arr={5,2,-21,6,3,9};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]<arr[j-1])
                    swap(arr,j,j-1);
                else
                    break;
            }
        }
    }
    static void swap(int[] arr,int first,int last){
        int temp  = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
