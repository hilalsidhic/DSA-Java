package com.hilal;

import java.util.Scanner;

public class Nestedswitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empid = input.nextInt();
        String department = input.next();
        switch (empid){
            case 1:
                System.out.println("Employee 1 ");
                break;
            case 2:
                System.out.println("Employee 2");
                break;
            case 3:
                switch (department){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "OP":
                        System.out.println("Operations department");
                        break;
                    default:
                        System.out.println("Department not valid");
                        break;
                }
                break;
            default:
                System.out.println("Enter a valid ID");
                break;
        }
    }
}
