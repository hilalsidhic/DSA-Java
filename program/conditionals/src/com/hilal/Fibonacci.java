package com.hilal;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms in fibonacci series to print : ");
        int a = input.nextInt();
        int first=0;
        int second=1;
        int temp;
        int i=0;
        while(i<a){
            System.out.println(first);
            temp=second;
            second=first+second;
            first=temp;
            i++;
        }
    }
}
