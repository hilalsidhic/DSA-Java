package com.hilal;

public class Sumofdigits {
    public static void main(String[] args) {
        int sm=sum(23232);
        System.out.println(sm);
    }
    public static int sum(int n){
        if (n==0)
            return 0;
        return n%10+sum(n/10);
    }
}
