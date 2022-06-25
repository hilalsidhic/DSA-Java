package com.hilal;

import java.util.ArrayList;

public class Linearsearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,4,4,5,6,7,8};
        int target = 4;
        System.out.println(search(arr,target,0));
    }
//    public static boolean search(int[] arr,int target,int start){
//        if(start==arr.length)
//            return false;
//        if((arr[start]==target) || (search(arr,target,start+1))) {
//            return true;
//        }
//        else
//            return false;
//    }
    public static ArrayList search(int[] arr,int target,int start,ArrayList<Integer> list){
        if(start==arr.length)
            return list;
        if(arr[start]==target){
            list.add(start);
        }
        return search(arr,target,start+1,list);
    }
    public static ArrayList search(int[] arr,int target,int start){
        ArrayList<Integer> list = new ArrayList<>();
        if(start==arr.length)
            return list;
        if(arr[start]==target){
            list.add(start);
        }
        ArrayList<Integer> downlist= search(arr,target,start+1);
        list.addAll(downlist);
        return list;
    }
}
