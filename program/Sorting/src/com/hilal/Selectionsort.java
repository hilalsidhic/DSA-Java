package com.hilal;

import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
        int[] arr={5,6,7,3,51,8};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] sort(int[] arr){
        int n = arr.length;
        for (int i=0;i<n;i++){
            int last = n-1-i;
            int maxindex = findmaxindex(arr,0,last);
            swaparray(arr,maxindex,last);
        }
        return arr;
    }
    static void swaparray(int[] arr,int maxindex,int last){
        int temp = arr[maxindex];
        arr[maxindex] = arr[last];
        arr[last] = temp;
    }
    static int findmaxindex(int[] arr, int first,int last){
        int max = first;
        for (int i = 1; i <= last; i++) {
            if(arr[max]<arr[i])
                arr[max]=arr[i];
        }
        return max;
    }
}
