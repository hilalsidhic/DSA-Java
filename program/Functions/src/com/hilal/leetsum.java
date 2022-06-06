package com.hilal;

import java.util.Arrays;

public class leetsum {
    public static void main(String[] args) {
        int[] nums = {2,5,5,11};
        int[] result =twoSum(nums,10);
        System.out.println(Arrays.toString(result));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i=0;i+1<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result= new int[]{i, j};
                }
            }
        }
        return result;
    }
}
