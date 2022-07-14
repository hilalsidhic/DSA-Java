package com.polymorphism;

public class Main {
    public static void main(String[] args) {
        Fruits f1 = new Fruits();
        Fruits f2 = new Apple();
        Fruits f3 = new Orange();

        f1.getInfo();           //UPCASTING
        f2.getInfo();
        f3.getInfo();
    }
}
