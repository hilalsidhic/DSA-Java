package com.hilal;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a'+3));

        System.out.println("a"+1);
        System.out.println("hilal" + new ArrayList<>());
        System.out.println("hilal" + new Integer(10));
        String ans = new Integer(56) + ""+new ArrayList<>() +""+new int[]{12,23,2};
        System.out.println(ans);
    }
}
