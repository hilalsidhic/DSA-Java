package com.hilal;

import java.util.Arrays;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class Leetcodeeven {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,52,63,8};
        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] arr) {
        int count =0;
        //int[] newarr = getdigits(arr);
        for (int val:arr) {
            count = count+checkeven(val);
        }
        return count;
    }
    static int checkeven(int check){
        int checknum = getdigits2(check);
        if(checknum%2==0){
            return 1;
        }
        else {
            return 0;
        }
    }
    static int getdigits(int val){
       // int [] newarr = new int[arr.length];
        //int i=0;
        //for (int val:arr) {
            int count = 0;
            if (val==0) {
                return 1;
            }
            while(val>0){
                val=val/10;
                count++;
            }
            //newarr[i]=count;
            //i++;
        return count;
    }
    static int getdigits2(int val){
        return (int)(Math.log10(val)) + 1;
    }

}
