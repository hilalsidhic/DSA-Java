package com.hilal;

public class Reversebits {
    public static void main(String[] args) {

        System.out.println(reverseBits(1010));
    }
    public static long reverseBits(int n) {

            int res = 0;
            for(int i=0;i<32;i++)
            {
                res = res*2 + (n&1);
                n = n >> 1;
                System.out.println(n&1);
            }
            return  res;
    }
}
