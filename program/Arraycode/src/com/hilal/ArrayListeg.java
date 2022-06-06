package com.hilal;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListeg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
        System.out.println(list);
        list.set(3,99);
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}
