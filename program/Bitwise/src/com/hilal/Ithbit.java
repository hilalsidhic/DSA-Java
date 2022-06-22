package com.hilal;

public class Ithbit {
    public static void main(String[] args) {
        int num = 12;//1100
        System.out.println(getith(num,3));
        System.out.println(setith(num,1));
        System.out.println(resetith(num,4));

    }
    public static int getith(int num,int target){
        return num & 1<<(target-1);
    }
    public static int setith(int num,int target){
        //use or operation
        return num | 1<<(target-1);
    }
    public static int resetith(int num,int target){
        //use 1 mask to reset the position by using and operatior
        return num & ~(1<<(target-1));
    }
}
