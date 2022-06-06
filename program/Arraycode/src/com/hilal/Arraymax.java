package com.hilal;

public class Arraymax {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,6,7};
        System.out.println(findmax(arr));
    }

    private static int findmax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
