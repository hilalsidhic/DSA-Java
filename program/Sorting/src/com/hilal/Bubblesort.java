package com.hilal;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr={5,6,7,3,51,8};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        int n = arr.length;
        boolean swapped = false;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-i; j++) {
                if(arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }

    }
}
