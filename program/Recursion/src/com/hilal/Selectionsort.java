package com.hilal;

import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,8,1};
        int[] newarr= sort(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(newarr));
    }
    static int[] sort(int[] arr,int length, int i,int max){
        if(length==0)
            return arr;
        else if((i)>=length){
            swap(arr,length,max);
            return sort(arr,length-1,0,0);
        }
        else{
            if(arr[i]<arr[i+1]){
                max = i+1;
            }
            return sort(arr,length,i+1,max);
        }

    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
