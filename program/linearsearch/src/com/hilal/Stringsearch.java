package com.hilal;

public class Stringsearch {
    public static void main(String[] args) {
        String str= "Hilal";
        char target = 'i';
        System.out.println(searchonstring(str,target));
    }
    static boolean searchonstring(String str, char target){
        for (int i : str.toCharArray()) {
            if(i==target){
                return true;
            }
        }
        return false;
    }
}
