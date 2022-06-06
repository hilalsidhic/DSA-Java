package com.hilal;

public class Greeting {
    public static void main(String[] args) {
        String greeting=greeting("hilal");
        System.out.println(greeting);
    }
    static String greeting(String name){
        String greeting = "HIs "+name;
        return greeting;
    }
}
