package com.hilal;

public class Countzero {
    public static void main(String[] args) {
        count(1001);
        System.out.println(count);
    }
    static int count = 0;
    public static void count(int n){
        if (n%10==n)
            return;
        if(n%10==0){
            count++;
        }
        count(n/10);
    }
}
