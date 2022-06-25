package com.hilal;

public class Productofdigits {

    public static void main(String[] args) {
        int pd=product(23232);
        System.out.println(pd);
    }
    public static int product(int n){
        if (n%10==n)
            return n;
        return n%10*product(n/10);
    }
}
