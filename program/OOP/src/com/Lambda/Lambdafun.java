package com.Lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambdafun {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            num.add(i + 1);
        }
//        num.forEach((item)-> System.out.println(item));
//        Consumer<Integer> items = (item)-> System.out.println(item*2);
//        num.forEach(items);
        Operations sum = (a, b) -> a + b;
        Operations mult = (a, b) -> a * b;
        Operations diff = (a, b) -> a - b;

        Lambdafun Mycalculator = new Lambdafun();
        System.out.println(Mycalculator.operating(10,20,sum));
        System.out.println(Mycalculator.operating(10,20,mult));
        System.out.println(Mycalculator.operating(10,20,diff));
    }

    private int operating(int a, int b, Operations op) {
        return op.operate(a, b);
    }
}
    interface Operations{
        int operate(int a,int b);
    }


