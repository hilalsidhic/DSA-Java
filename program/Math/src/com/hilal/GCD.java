package com.hilal;

public class GCD {
    public static void main(String[] args) {
        System.out.println(lcm(7,3));
    }
    static int gcdfind(int a,int b){
        if (a==0)
            return b;
        return gcdfind(b%a,a);
    }
    static int lcm(int a,int b){
        return a*b/gcdfind(a,b);
    }
}
