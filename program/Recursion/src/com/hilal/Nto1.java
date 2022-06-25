package com.hilal;

public class Nto1 {
    public static void main(String[] args) {
        printnum2(15);
    }
    static void printnum(int n){
        if (n==0)
            return;
        System.out.println(n);
        printnum(n-1);
    }
    static void printnum2(int n){
        if (n==0)
            return;
        printnum2(n-1);
        System.out.println(n);
    }
}
