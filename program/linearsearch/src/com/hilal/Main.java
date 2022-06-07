package com.hilal;

public class Main {
    public static void main(String[] args) {
        int[] arr={1,4,3,5,7,8,-22,10};
        int target= 9;
        int position = linearsearch(arr,target);
        System.out.println(position);
    }
    static int linearsearch(int[] array,int target){
        for (int i = 0; i < array.length ; i++) {
            if (array[i]==target){
                return i;
            }
        }
        return -1;
    }
}