package com.hilal;

public class Addbinary {
    public static void main(String[] args) {
        String a="1010";
        String b="1011";
        System.out.println(add(a,b));

    }
    private static String add(String a,String b){

        int num1 = addbinary(a);
        int num2 = addbinary(b);
        int sum = num1+num2;
        System.out.println(sum);
        String bsum=Integer.toBinaryString(sum).toString();
        return bsum;
    }
    private static int addbinary(String a){
        char[] a1 = a.toCharArray();
        int num=0,deg=1;
        for (int i = a1.length-1; i >=0; i--) {
            num = num+ Character.getNumericValue(a1[i])*deg;
            deg=deg*2;
        }
        return num;
    }
}
