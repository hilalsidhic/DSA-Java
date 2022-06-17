package com.hilal;

public class Comparison {
    public static void main(String[] args) {
        String a = "hilal";
        String b = "hilal";
        System.out.println(a==b);

        String str1 = new String("hilal");
        String str2 = new String("hilal");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.charAt(0));
    }
}
