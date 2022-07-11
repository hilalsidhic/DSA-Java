package com.statics;

public class Prep {
    public static void main(String[] args) {
//        greeting();
        hello();
    }
    static void hello(){
        System.out.println("OK");
        Prep obj = new Prep();
        obj.greeting();
    }
    void greeting(){
        System.out.println("Hello welcome to the system");
    }
}
