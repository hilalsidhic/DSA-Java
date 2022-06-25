package com.hilal;

public class Sum {
    public static void main(String[] args) {
        System.out.println(sumof(5));
    }
    static int sumof(int n){
        if(n==0){
            return 0;
        }
        return sumof(n-1)+n;
    }
}
