package com.hilal;

import java.util.ArrayList;
import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,8,1};
        int[] newarr= sort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(newarr));
    }
    static int[] sort(int[] arr,int length, int i){
        if(length==0)
            return arr;
        else if((i)>=length)
            return sort(arr,length-1,0);
        else
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            return sort(arr,length,i+1);
    }
}
