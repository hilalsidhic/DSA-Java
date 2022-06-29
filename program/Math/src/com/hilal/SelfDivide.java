package com.hilal;

import java.util.ArrayList;
import java.util.List;

public class SelfDivide {
    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(2,22));
    }
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> newlist = new ArrayList<>();
        String s1 = new String();
        s1.star
        if(left>right){
            return newlist;
        }
        if(check(left))
        {
            newlist.add(left);
        }
        newlist.addAll(selfDividingNumbers(left+1,right));
        return newlist;
    }
    public static boolean check(int i){
        int left = i;
        while (i>0){
            int n = i%10;
            if(n==0)
                return false;
            if (left%n!=0)
                return false;
            i=i/10;
        }
        return true;
    }
}
