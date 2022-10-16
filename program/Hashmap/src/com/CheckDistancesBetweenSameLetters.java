package com;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/check-distances-between-same-letters/
public class CheckDistancesBetweenSameLetters {
    public static void main(String[] args) {
        String s = "aa";
        int[] distance = new int[]{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        System.out.println(checkWellSpaced(s,distance));
    }
    public static boolean checkWellSpaced(String s,int[] distance){
        Map<Character,Integer > map = new HashMap<>();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],i);
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])){
                if (i != map.get(arr[i])){
                    if(!finalcheck(i,map.get(arr[i]),arr[i],distance)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static boolean finalcheck(int i ,int j,char ch,int[] distance){
        int diff = j-i-1;
        int charinserted = (int)(ch);
        if (distance[charinserted-97]==diff){
            return true;
        }
        return false;

    }
}
