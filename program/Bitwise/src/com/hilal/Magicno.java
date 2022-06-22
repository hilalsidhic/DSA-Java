package com.hilal;

public class Magicno {
    public static void main(String[] args) {
        int num  = 5;
        System.out.println(findmagic(num));
    }
    public static int findmagic(int n){
        int ans = 0;
        int base = 5;
        while(n>0){
            int last = n & 1;
            n = n>>1;
            ans = ans+last*base;
            base = base*5;
        }
        return ans;
    }
}
