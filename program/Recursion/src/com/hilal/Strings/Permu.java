package com.hilal.Strings;

import java.util.ArrayList;
import java.util.List;

public class Permu {
    public static void main(String[] args) {
        System.out.println(letterCase("","a1b2"));
    }
    public static List<String> letterCase(String p,String s) {
        List<String> list = new ArrayList<>();
        if(s.isEmpty())
        {
            list.add(p);
            return list;
        }
        char ch = s.charAt(0);
        list.addAll(letterCase(p+ch,s.substring(1)));
        if (ch+0>=65&&ch<=90){
            ch+=(97-65);
            list.addAll(letterCase(p+ch,s.substring(1)));
        }
        else if (ch + 0 >= 97 && ch <= 122) {
            ch-=(97-65);
            list.addAll(letterCase(p+ch,s.substring(1)));
        }
        return list;
    }
}
