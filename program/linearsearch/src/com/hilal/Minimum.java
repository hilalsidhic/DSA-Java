package com.hilal;

public class Minimum {
    public static void main(String[] args) {
        int[] arr = {21,52,23,54,35,6,7,2};
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        int min=arr[0];
        for (int val:arr) {
            if(val<min){
                min=val;
            }
        }
        return min;
    }

}
