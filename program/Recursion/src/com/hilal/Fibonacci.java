package com.hilal;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibformula(50));
    }
    public static int fibformula(int num){
        return (int)((Math.pow((1+Math.sqrt(5))/2,num) - Math.pow((1-Math.sqrt(5))/2,num))/Math.sqrt(5));
    }
    public static int fib(int num){
        if(num==0)
            return 0;
        if(num==1)
            return 1;
        return fib(num-1)+fib(num-2);
    }
}
