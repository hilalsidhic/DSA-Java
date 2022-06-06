package com.hilal;

import java.util.Scanner;

public class Charoccurances {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the character to check");
        char search = input.next().trim().charAt(0);
        System.out.println("Enter the string");
        String strinput =input.next();
        int i=0;
        boolean found =false;
        while(i< strinput.length()){
            if(search == strinput.trim().charAt(i)){
                System.out.println("found at "+ (i+1));
                found=true;
            }
            i++;
        }
        if (!found){
            System.out.println("Not found");
        }
    }
}
