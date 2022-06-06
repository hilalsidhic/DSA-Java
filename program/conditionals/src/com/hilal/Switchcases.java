package com.hilal;

import java.util.Scanner;

public class Switchcases {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the fruit name");
        String fruit = input.next();
        switch (fruit) {
            case "orange" -> System.out.println("Orange is the fruit");
            case "apple" -> System.out.println("Apples is the fruit");
            case "melon" -> System.out.println("Melon is the fruit");
            default -> System.out.println("Cant find the required fruit");
        }
    }
}
