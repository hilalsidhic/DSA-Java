package com.hilal;

import java.util.Arrays;

public class TwoDarraysearch {
    public static void main(String[] args) {
        int[][] arr= {{10, 20, 30, 40},
                {12,22,32,42},{14,26,36,46},{16,28,38,48}};
        int target = 36;
        System.out.println(Arrays.toString(binarysearch(arr,target)));
    }
    static int[] binarysearch(int[][] arr,int target){
        int row=0;
        int col=arr.length-1;
        while(row<=col){
            if(arr[row][col]==target){
                return new int[]{row,col};
            }
            if(arr[row][col]>target){
                col--;
            }
            else{
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}
