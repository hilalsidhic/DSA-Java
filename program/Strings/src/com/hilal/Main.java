package com.hilal;

public class Main {
    public static void main(String[] args) {
        String name = "hilal";
        System.out.println("Hello "+name);
        String[] word1 = {"ab","c"};
        String[] word2 = {"a" , "bc"};
        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();
        stringarrange(builder1,word1);
        stringarrange(builder2,word2);
        System.out.println(builder2);
        System.out.println(builder1);
        System.out.println(builder1==builder2);
    }
    public static void stringarrange(StringBuilder builder,String[] word){
        for(int i=0;i<word.length;i++){
            builder.append(word[i]);
        }
    }
    }
