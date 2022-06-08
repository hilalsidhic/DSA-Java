package com.hilal;
//find the ceiling which is equal to or immediate highest value in the array for a target
public class Ceilingbinary {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,7,8,9,12};
        int [] arr2 = {9,6,4,2,1};
        System.out.println(binarysearchceiling(arr2,10));
    }
     static int binarysearchceiling(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[0]<arr[arr.length -1]){
                /*if(start == end){
                    return arr[mid];
                }*/
                if(target>arr[arr.length-1]){
                    return -1;
                }
                if (target > arr [mid]){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
            else{
                /*if(start == end){
                    return arr[mid];
                }*/
                if(target > arr [0]){
                    return -1;
                }
                if(target > arr[mid]){
                    end = mid - 1 ;
                }
                else {
                    start = start + 1;
                }
            }
        }
        if (arr[0]<arr[arr.length -1 ]){
            return arr[start];           //for floor of the number reverse start and end
        }
        else {
            return arr[end];
        }
     }
}
