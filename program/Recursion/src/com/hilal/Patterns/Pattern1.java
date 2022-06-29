package com.hilal.Patterns;
//****
//***
//**
//*
public class Pattern1 {
    public static void main(String[] args) {
        pattern2(4,0);
    }
    public static void pattern(int n,int i){
        if(n<=0){
            return;
        }
        if(i>=n){
            System.out.println("");
            pattern(n-1,0);
        }
        else {
            System.out.print("*");
            pattern(n,i+1);
        }
    }
    public static void pattern2(int n,int i){
        if(n==0){
            return;
        }
        if(i>=n){
            pattern2(n-1,0);
            System.out.println("");
        }
        else {
            pattern2(n,i+1);
            System.out.print("*");
        }
    }
}
