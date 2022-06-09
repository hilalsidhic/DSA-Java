package com.hilal;
//https://leetcode.com/problems/find-in-mountain-array/
public class Findinmountainarray {
    public static void main(String[] args) {
        int[] arr= {4,5,6,5,4,3,2,1,0,-1,-2};
        int target = -2;
        System.out.println(binarysearchfind(arr,target));
    }
    static int binarysearchfind(int[] arr,int target){
        int max = binarysearchpeak(arr);
        int search = binarysearch(arr,target,max,true);
        if(search == -1){
            search = binarysearch(arr,target,max,false);
        }
        return search;
    }
    static int binarysearch(int[] arr, int target, int max , boolean isfirst){
        int start = max + 1;
        int end = arr.length - 1;
        if(isfirst){
            start = 0;
            end = max;
        }
        while(start<end){
            int mid = start + (end - start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[start]>arr[end]) {
                if (target > arr[mid]) {
                    end = mid;
                } else {
                    start = mid + 1;
                }
            }
            else{
                if (target > arr[mid]){
                    start = mid + 1;
                }
                else {
                    end = mid;
                }
            }
        }
        if(arr[start]==target){
            return start;
        }
        return -1;
    }
    static int binarysearchpeak(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid+1]>arr[mid]){
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return start;
    }
}
