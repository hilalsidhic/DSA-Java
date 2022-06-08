package com.hilal;

import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class Firstandlast {
    public static void main(String[] args) {
        int[] nums = {1,2,2,2,3,5,5,5,6,7,8,9};
        int target = 5;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }
    static int[] searchRange(int[] nums, int target) {
        int[] num={-1,-1};
        num[0]=search(nums,target,true);
        num[1]=search(nums,target,false);
        return num;

    }
    static int search(int[] nums,int target,boolean searchfirst){
        int num = -1;
        int start = 0;
        int end = nums.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid]==target){
                num = mid;
                if(searchfirst){
                    end= mid -1;
                }
                else{
                    start = mid + 1;
                }
            }
            else if (nums[mid]>target){
                end= mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return num;
    }
}
