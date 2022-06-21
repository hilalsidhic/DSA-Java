package com.hilal;

public class Binarysrch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,77,88,89};
        int target = 88;
        System.out.println(search(arr,target,0,arr.length-1));
    }
    public static int search(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid = start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        } else if (arr[mid]>target) {
            return search(arr,target,0,mid-1);
        }
        else
            return search(arr,target,mid+1,end);
    }
}
