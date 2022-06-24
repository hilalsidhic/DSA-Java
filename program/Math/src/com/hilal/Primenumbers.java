package com.hilal;

public class Primenumbers {
    public static void main(String[] args) {
        int num = 20;
        for (int i = 0; i < num; i++) {
            System.out.println(i+"Is"+primeprint(i));
        }
    }
    public static boolean primeprint(int i){
        int n = 2;
        if(i<=1)
            return false;
        while (n*n<=i){
            if(i%n==0)
                return false;
            n++;
        }
        return true;
    }
}
