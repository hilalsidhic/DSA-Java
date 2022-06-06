package com.hilal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number");
        int a = input.nextInt();
        System.out.print("Enter the second number");
        int b = input.nextInt();
        int sum =add2(a,b);
        System.out.println("THe sum is "+sum);
    }
    static int add2(int a, int b){

        int sum = a+b;
        return sum;
    }
    static void add(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number");
        int a = input.nextInt();
        System.out.print("Enter the second number");
        int b = input.nextInt();
        int sum = a+b;
        System.out.println(sum);
    }
}