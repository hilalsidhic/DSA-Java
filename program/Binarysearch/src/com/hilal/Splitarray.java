package com.hilal;

import java.util.Arrays;

public class Splitarray {
    public static void main(String[] args) {
       int[] nums = {7,2,5,10,8};
       int m = 2;
        System.out.println(splitArray(nums,m));
    }
    static int splitArray(int[] nums,int m){
        int first = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            first = Math.max(first,nums[i]);
            end +=nums[i];
        }
        while(first<end){
            int mid = first + (end-first)/2;
            int pieces = 1;
            int sum = 0;
            for (int num:nums) {
                if((sum+num)>mid){
                    sum = num;
                    pieces++;
                }
                else {
                    sum+=num;
                }
            }
            if(pieces>m){
                first = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return end;
    }
}
