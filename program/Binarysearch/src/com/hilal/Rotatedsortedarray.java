package com.hilal;

public class Rotatedsortedarray {
    public static void main(String[] args) {
        int[] arr = {6,7,8,9,1,2,3,4,5};
        int target = 6;
        System.out.println(findrotated(arr,target));
    }
    static int findrotated(int[] nums,int target){
        int pivot = pivotsearch(nums,target);
        System.out.println(pivot);
        if(pivot == -1){
            //normal search
            return binarysearch(nums,target,0,nums.length - 1);
        }if (target==nums[pivot]){
            return pivot;
        }
        else if(target>=nums[0]){
            //check firsthalf
            return binarysearch(nums,target,0,pivot-1);
        }
        else {
            return binarysearch(nums,target,pivot+1,nums.length - 1);
        }
    }
    static int binarysearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    static int pivotsearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid<end&&arr[mid]>arr[mid+1]){
                return mid;
            }
            if(arr[mid-1]>arr[mid]){
                return mid - 1;
            }
            if(arr[start]>arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
