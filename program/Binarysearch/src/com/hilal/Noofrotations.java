package com.hilal;

public class Noofrotations {
    public static void main(String[] args) {
        int[] arr = {5,5,6,6,6,6,6,7,8,9,1,2,3,4,5};
        System.out.println(pivotwithrepeat(arr)+1);
    }
    static int pivotwithrepeat(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start<end){
            int mid = start + (end-start)/2;
            if(mid>0&&arr[mid-1]>arr[mid]){
                return mid-1;
            }
            if(mid<arr.length-1&&arr[mid]>arr[mid+1]){
                return mid;
            }
            if(arr[start]==arr[mid] && arr[mid]==arr[start]){
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end-1]>arr[end]){
                    return end-1;
                }
                end--;
            }
            else if(arr[start]<arr[mid] || (arr[mid]==arr[start]&&arr[mid]>arr[end])){
                start=mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }
}
