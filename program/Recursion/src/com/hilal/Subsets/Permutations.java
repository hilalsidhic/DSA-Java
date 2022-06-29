package com.hilal.Subsets;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        permutations("abc","");
        System.out.println(permutations("abc",""));
    }
    public static ArrayList<String> permutations(String up, String p){
        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String left = p.substring(0,i);
            String right = p.substring(i,p.length());
            list.addAll(permutations(up.substring(1),left+ch+right));
        }
        return list;
    }
}
