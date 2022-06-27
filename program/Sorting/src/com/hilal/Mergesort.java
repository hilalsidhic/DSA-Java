package com.hilal;

import java.util.Arrays;

public class Mergesort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,8,7,9,3,5,11};
        arr = mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] mergesort(int[] arr){
        if(arr.length==1)
            return arr;
        int mid = arr.length/2;
        int[] left = mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    public static int[] merge(int[] first,int[] second){
        int i = 0,j=0,k=0;
        int[] third = new int[first.length+second.length];
        while (i<first.length&&j<second.length){
            if (first[i]<second[j]){
                third[k]=first[i];
                i++;
            }
            else {
                third[k]=second[j];
                j++;
            }
            k++;
        }
        //if exits before completing one of them
        while(i<first.length){
            third[k]=first[i];
            i++;k++;
        }
        while(j<second.length){
            third[k]=second[j];
            j++;k++;
        }
        return third;
    }
}
