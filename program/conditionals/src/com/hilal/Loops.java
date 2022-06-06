package com.hilal;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //Print numbers from 1 to 5
        for (int i=0;i<5;i++){
            System.out.print(i+1);
        }
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if(a>10){
            System.out.println("greater than 10");
        } else if (a>5&&a<=10) {
            System.out.println("between 5 and 10");
        }
        else {
            System.out.println("less than 5 or 5");
        }
        int i=1;
        do {
            System.out.println("this is the "+i+" iteration");
            i++;
        }while(i<4);
    }
}
