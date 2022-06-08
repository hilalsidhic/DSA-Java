package com.hilal;

public class Smallestletter {
    public static void main(String[] args) {
       char[] letters = {'e','e','e','e','e','e','n'};
       char target = 'e';
        System.out.println(nextGreatestLetter(letters,target));
    }
    static char nextGreatestLetter(char[] letters,char target){
        int start = 0;
        int end = letters.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if (target >= letters[mid]){
                start = mid + 1;
            }
            else{
                end = end - 1;
            }
        }
        return letters[start % letters.length];
    }
}
