package com.hilal;

import java.util.Scanner;

public class Largestofthree {
    public static void main(String[] args) {
        //find the largest of three numbers
        Scanner input = new Scanner(System.in);
        System.out.print("Input the First Number : ");
        int a = input.nextInt();
        System.out.println("Input the Second Number : ");
        int b = input.nextInt();
        System.out.println("Input the Third Number : ");
        int c = input.nextInt();

        /*if(a>b){
            if (a>c){
                System.out.println(a+" is the greatest");
            } else{
                System.out.println(c+"ist the greatest");
            }
        }
        else if (b>a){
            if(b>c){
                System.out.println(b+ "is the greatest");
            }
            else {
                System.out.println(c+" is the greatest");
            }
        }*/
        int max = a;
        if(b>max){
            max=b;
        }
        if (c>max){
            max=c;
        }
        System.out.println("largest is "+max);
    }
}
