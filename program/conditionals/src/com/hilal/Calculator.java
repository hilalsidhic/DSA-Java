package com.hilal;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner iexpr = new Scanner(System.in);
        System.out.println("Enter the two operands");
        int a=iexpr.nextInt();
        int b=iexpr.nextInt();
        int c=0;
        System.out.println("Enter the operation to evaluate");
        System.out.println("Press X to get out");
        char expr = iexpr.next().charAt(0);
        if (expr == '+' || expr =='-'||expr=='/'||expr=='*'){
            if(expr == '+'){
                 c = a+b;

            }
            else if(expr =='-'){
                 c = a-b;

            }
            else if(expr=='/'){
                 c= a/b;

            }
            else if (expr=='*'){
                 c=a*b;

            }
        }
        System.out.println("The answer is "+c);
    }
}
