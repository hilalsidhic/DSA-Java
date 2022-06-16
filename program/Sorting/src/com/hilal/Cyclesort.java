package com.hilal;

import java.util.Arrays;

public class Cyclesort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,4,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(correct==i)
                i++;
            else
                swap(arr,i,correct);
        }
    }
    static void swap(int[] arr,int first,int target){
        int temp = arr[first];
        arr[first] = arr[target];
        arr[target] = temp;
    }
}
