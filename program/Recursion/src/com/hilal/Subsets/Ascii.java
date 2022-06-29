package com.hilal.Subsets;

import java.util.ArrayList;
import java.util.Arrays;

public class Ascii {
    public static void main(String[] args) {
        ArrayList<String> list = sub("","ab");
        System.out.println(Arrays.toString(list.toArray()));
    }
    public static ArrayList<String> sub(String p,String up){
        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> newlist=sub(p+ch,up.substring(1));
        list.addAll(newlist);
        ArrayList<String> newlist1=sub(p+(int)(ch),up.substring(1));
        list.addAll(newlist1);
        ArrayList<String> newlist2=sub(p,up.substring(1));
        list.addAll(newlist2);
        return list;
    }
}
