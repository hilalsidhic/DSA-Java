package com.hilal;

public class Checksorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,7};
        System.out.println(check(arr,0));
    }
    public static boolean check(int[] n,int start){
        if(start==n.length-1){
            return true;
        }
        return n[start]<n[start+1] && check(n,start+1);
    }
}
