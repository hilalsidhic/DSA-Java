package com.hilal;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class Mountainarray {
    public static void main(String[] args) {
        int arr[] = {0,1,2,4,2,1};
        System.out.println(peakIndexInMountainArray(arr));
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while(start<end){
            int mid = start + (end - start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return end;
    }
}
