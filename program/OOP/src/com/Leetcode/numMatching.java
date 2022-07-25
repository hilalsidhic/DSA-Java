package com.Leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/number-of-matching-subsequences/
public class numMatching {
    public static int numMatchingSubseq(String s, String[] words) {
        return sequence(s,"",words);
    }

    private static int sequence(String up, String p, String[] words) {
        int count = 0 ;
        if(!up.isBlank()){
            char c = up.charAt(0);
            count =count + sequence(up.substring(1),p+c,words);
            count =count + sequence(up.substring(1),p,words);
        }
        for (int i = 0; i < words.length; i++) {
            if (p.equals(words[i])){
                return 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numMatchingSubseq("abcde",new String[]{"a","bb","acd","ace"}));
    }
}
