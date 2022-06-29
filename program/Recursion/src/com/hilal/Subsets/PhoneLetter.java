package com.hilal.Subsets;

import java.util.ArrayList;
import java.util.List;

public class PhoneLetter {
    public static void main(String[] args) {
        System.out.println(combo("29",new String()));
    }
    public static List<String> combo(String up, String p){
        List<String> list = new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';
        if(digit==1)
            return list;
        int startcount=0,endcount=0;
        if(digit==7){
//            int end = (digit-1)*3+1;
            endcount=1;
        } else if (digit == 8) {
//            int start = (digit-2)*3+1;
            startcount=1;
//            int end = (digit-1)*3+1;
            endcount=1;
        } else if (digit == 9) {
//            int start = (digit-2)*3+1;
            startcount=1;
//            int end = (digit-1)*3+2;
            endcount=2;
        }

        int start = (digit-2)*3+startcount;
        int end = (digit-1)*3+endcount;
        while(start<end){
            list.addAll(combo(up.substring(1),p+(char)('a'+start)));
            start++;
        }
        return list;
    }
}
