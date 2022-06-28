package com.hilal;

import java.util.Arrays;

public class mergeredo {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        sort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr,int start,int end){
        int mid = start+(end-start)/2;
        if(end-start==1)
            return;
        sort(arr,start,mid);
        sort(arr,mid,end);
        merge(arr,start,mid,end);
    }
    public static void merge(int[] arr,int start,int mid,int end){
        int i=start,j=mid,k=0;
        int[] mix = new int[end-start];
        while(i<mid&&j<end){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }
            else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<mid){
            mix[k]=arr[i];
            k++;i++;
        }
        while(j<end){
            mix[k]=arr[j];
            k++;j++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[l+start]=mix[l];
        }
    }
}
