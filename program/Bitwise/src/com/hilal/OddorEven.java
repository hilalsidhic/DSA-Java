package com.hilal;

public class OddorEven {
    public static void main(String[] args) {
        int num = 67;
        System.out.println(oddcheck(num));
    }
    public static boolean oddcheck(int num){
        return (num&1)==1;
    }
}
