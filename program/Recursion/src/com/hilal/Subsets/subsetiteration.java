package com.hilal.Subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetiteration {
    public static void main(String[] args) {
        System.out.println(subduplicate(new int[]{1,2,2}));
    }
    public static List<List<Integer>> sub(int[] nums){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num:nums) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }
    public static List<List<Integer>> subduplicate(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start =  0;
        int end = 0;
        for (int j=0;j<nums.length;j++) {
            int n = outer.size();
            end = outer.size()-1;
            if(j>0&&(nums[j]==nums[j-1])){
                start=end-1;
            }
            end = outer.size()-1;
            for (int i = start; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(nums[j]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
