package com.hilal;

public class AgnosticBS {
    public static void main(String[] args) {
        //int[] arr = {-32,-21,0,1,2,3,4,5,6,7,8,9,12};
        int[] arr = {9,7,5,3,2,1};
        int target = 1;
        System.out.println(binarysearch(arr,target));
    }
    static int binarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if (target == arr[mid]){
                return mid;
            }
            else if(arr[start]>arr[end]){
                if(target > arr[mid]){
                    end = mid -1;
                }
                else if(target<arr[mid]){
                    start = mid+1;
                }
            }
            else if(arr[start]<arr[end]){
                if(target < arr[mid]){
                    end = mid-1;
                }
                else if(target>arr[mid]){
                    start = mid +1;
                }
            }
        }
        return -1;
    }
}
