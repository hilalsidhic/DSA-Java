package com.hilal.Subsets;

import java.util.ArrayList;
import java.util.List;

public class Dice {
    public static void main(String[] args) {
        System.out.println(diceroll("",4));
    }
    public static List<String> diceroll(String p,int target){
        List<String> list = new ArrayList<>();
        if(target==0){
            list.add(p);
            return list;
        }
        for (int i = 1; i <= target; i++) {
            list.addAll(diceroll(p+i,target-i));
        }
        return list;
    }
}
