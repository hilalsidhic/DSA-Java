package com.hilal;

import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        variableargs("hilal","fsf");
    }
    static void variableargs(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
