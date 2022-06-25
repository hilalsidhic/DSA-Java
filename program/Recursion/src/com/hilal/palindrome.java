package com.hilal;

public class palindrome {
    public static void main(String[] args) {
        int num = 12321;
        if(num==rev(num))
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
    }
    static int rev(int n){
        if(n%10==n)
            return n;
        int digits = (int) Math.log10(n)+1;
        return (int) (n%10*Math.pow(10,digits-1)+rev(n/10));
    }
}
