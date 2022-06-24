package com.hilal;

import java.util.Arrays;

public class Sieveoferatosthenes {
    public static void main(String[] args) {
        int n=10000;
        boolean[] prime = new boolean[n+1];
        sieve(prime,n);
    }
    public static void sieve(boolean[] prime,int n){
        for (int i = 2; i*i < n; i++) {
            if(!prime[i]){
                for (int j = i*2; j <= n; j+=i) {
                    prime[j]=true;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (!prime[i])
                System.out.println(i);
        }
    }
}
