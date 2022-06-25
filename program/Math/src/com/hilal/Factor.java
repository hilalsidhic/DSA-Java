package com.hilal;

import java.util.ArrayList;

public class Factor {
    public static void main(String[] args) {
        fact2(20);
    }
    //O(n)
    public static void fact(int n){
        for (int i = 1; i <= n; i++) {
            int term = n%i;
            if(term==0)
                System.out.println(i);
        }
    }
    //O(root n)
    public static void fact2(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n%i==0)
                if(n/i==i)
                    System.out.print(i+" , ");
                else{
                    System.out.print(i+" , ");
                    list.add(n/i);
                }
        }
        for (int i = list.size()-1; i >=0 ; i--) {
            if(i==0)
                System.out.print(list.get(i));
            else
                System.out.print(list.get(i)+" , ");
        }
    }
}
