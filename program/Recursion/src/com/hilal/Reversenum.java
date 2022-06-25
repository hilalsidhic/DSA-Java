package com.hilal;

public class Reversenum {
    public static void main(String[] args) {
        System.out.println(reverse(2324));

    }
//    static int sum = 0;
    public static int reverse(int n){
//        sum = sum*10+(n%10);
//        System.out.println(sum);
        if(n%10==n){
            return n;
        }
        int digits = (int) Math.log10(n);
        return (int) ((n%10)*Math.pow(10,digits)+reverse(n/10));
    }
}
