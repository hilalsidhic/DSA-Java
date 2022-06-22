package com.hilal;

public class Main {
    public static void main(String[] args) {
        int num = 10;
        int news = 0;
        System.out.println(num<<1);
        System.out.println(getbinary(num,news));
        System.out.println("Hello world!");
    }
    public static int getbinary(int num,int binary){
        if(num/2==1){
            System.out.println(binary);
            return binary<<1;
        }
        int newn = num%2;
        binary=binary<<newn;
        return getbinary(num/2,binary);
    }
}