package com.hilal;

import java.util.Arrays;

public class Inplacemergesort {
    public static void main(String[] args) {
            int[] arr = {5,4,3,2,1,8,4,6,9};
            mergesort(arr,0,arr.length);
            System.out.println(Arrays.toString(arr));
        }
        public static void mergesort(int[] arr,int start,int end){
            if(end - start==1)
                return ;
            int mid = start+(end-start)/2;
            mergesort(arr,start,mid);
            mergesort(arr,mid,end);
            merge(arr,start,mid,end);
        }
        public static void merge(int[] arr,int start,int mid,int end){
            int i = start,j=mid,k=0;
            int[] third = new int[end-start];
            while (i<mid&&j<end){
                if (arr[i]<arr[j]){
                    third[k]=arr[i];
                    i++;
                }
                else {
                    third[k]=arr[j];
                    j++;
                }
                k++;
            }
            //if exits before completing one of them
            while(i<mid){
                third[k]=arr[i];
                i++;k++;
            }
            while(j<end){
                third[k]=arr[j];
                j++;k++;
            }
            for (int l = 0; l < third.length; l++) {
                arr[l+start]=third[l];
            }
        }
}
