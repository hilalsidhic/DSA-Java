package com.hilal;

public class Noofdigits {
    public static void main(String[] args) {
        int a = 1323;
        int base = 10;
        int num =(int) (Math.log(a)/Math.log(base))+1;
        System.out.println(num);
    }
}
