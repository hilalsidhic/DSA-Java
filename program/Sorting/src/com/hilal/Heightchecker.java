package com.hilal;

import java.util.Arrays;

public class Heightchecker {
    public static void main(String[] args) {
        int[] heights ={1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }
    public static int heightChecker(int[] heights) {
        int n = heights.length;
        int[] expected = heights;
        boolean swap = false;

        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                if(expected[j-1]>expected[j]){
                    int temp = expected[j-1];
                    expected[j-1]=expected[j];
                    expected[j] = temp;
                    swap = true;
                }
            }
            if(!swap){break;}
        }
        System.out.println(Arrays.toString(expected));
        //expected array sorted
        int count =0;
        for(int i=0;i<n;i++){
            if(heights[i]==expected[i]){
                count++;
            }
        }
        return count;
    }
}
