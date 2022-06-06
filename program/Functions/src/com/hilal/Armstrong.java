package com.hilal;

import java.util.Arrays;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        int arri=0;
        System.out.println("enter the number to check");
        for (int i =100;i<1000;i++){
            int a = i;
            if(checkarmstrong(a)){
                arr[arri]=a;
                arri++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static boolean checkarmstrong(int a){
        int num = a;
        int sum =0;
        for (int i=0;num>0;i++){
            int rem = num%10;
            num = num/10;
            sum = sum + rem*rem*rem;
        }
        if(sum==a){
            return true;
        }
        else {
            return false;
        }
    }
}
