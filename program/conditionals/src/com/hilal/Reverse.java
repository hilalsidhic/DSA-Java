package com.hilal;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int reversenum=0;
        int i=0;
        while(num>0){
            reversenum=(reversenum*10)+(num%10);
            num=num/10;
        }
        System.out.println(reversenum);
    }
}
