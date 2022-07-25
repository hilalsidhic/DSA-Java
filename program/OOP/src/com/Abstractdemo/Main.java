package com.Abstractdemo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a);
        Daughter d = new Daughter(23);
        d.career();

        Son s = new Son(19);
        s.partner();
        //cannot create object of abstract class directly you have to add implementation before adding it.
//        Parent mom = new Parent(42) {
//            @Override
//            void career() {
//
//            }
//
//            @Override
//            void partner() {
//
//            }
//        }
    }
}
