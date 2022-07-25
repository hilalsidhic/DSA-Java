package com.AccessTest;

import com.Access.A;

public class Subclass extends A {

    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass(4,"Khoj");
        System.out.println(obj.name);
    }
}
