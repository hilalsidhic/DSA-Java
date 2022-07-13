package com.inheritance;

public class Main {
    public static void main(String[] args) {
        BoxWeight b1 = new BoxWeight(2,3,4,12);
        System.out.println(b1.l+" "+b1.h+" "+ b1.w+" "+ b1.weight);
        BoxPrice b2 = new BoxPrice(2,3,4,5,5);
        Box b3 = new BoxPrice(b2,7,6);
    }
}
