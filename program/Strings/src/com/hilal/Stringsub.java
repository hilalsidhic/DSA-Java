package com.hilal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stringsub {
    public static void main(String[] args) {
        String[] words1 = {"amazon","apple","facebook","google","leetcode"};
        String[] words2 = {"e","oo"};
        System.out.println(wordSubsets(words1,words2));
    }
    public static List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> list = new ArrayList<>();
        String[] words1cp = words1.clone();
        for (int i = 0; i < words1.length; i++) {
            boolean isIt = true;
            for (int j = 0; j < words2.length; j++) {
                if(words2[j].length()>1){
                    String[] word3 = words2[j].split("");
                    System.out.println(word3[0]);
                    for (int k = 0; k < word3.length; k++) {
                        if (!words1[i].contains(word3[k])) {
                            isIt = false;
                            break;
                        }
                        words1[i].replace(word3[k],"");
                    }
                }
                else if (!words1[i].contains(words2[j])) {
                    isIt = false;
                    break;
                }
            }
            if (isIt)
                list.add(words1cp[i]);
        }
        return list;
    }
}

