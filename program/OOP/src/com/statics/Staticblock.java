package com.statics;

public class Staticblock {
    static int num = 5;
    static int count;
    static {
        System.out.println("Hello and welcome");
        count = num*5;
    }

    public static void main(String[] args) {
        Staticblock s1 = new Staticblock();
        Staticblock e1 = new Staticblock();
        System.out.println(Staticblock.count);
    }
}
