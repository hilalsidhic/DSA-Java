package com.hilal;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    static boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll(" ","");
        s=s.replaceAll("[^a-zA-Z0-9]","");
        int first = 0;
        int last = s.length()-1;
        while(first<=last){
            char firstch = s.charAt(first);
            char secondch = s.charAt(last);
            if(firstch == secondch){
                first++;last--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
