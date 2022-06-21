package com.hilal;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(7));
    }
    public static int fib(int num){
        if(num==1)
            return 0;
        if(num==2)
            return 1;
        return fib(num-1)+fib(num-2);
    }
}
