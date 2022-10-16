package com;
import java.util.*;
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
public class TwoSum {
    public static void main(String[] args) {
        int[]nums = new int[]{2,7,11,15};
        int target = 26;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
    public static int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        int[] ret = new int[2];
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            int req = target - nums[i];
            if (map.containsKey(req)){
                ret[0]= map.get(req);
                ret[1] = i;
            }
        }
        return ret;
    }
}
