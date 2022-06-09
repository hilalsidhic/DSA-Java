package com.hilal;

public class InfinityarrayBS {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,32,45,46,47,54,65,92};
        int target = 45;
        System.out.println(helpsearch(arr,target));
    }
    static int helpsearch(int[] arr,int target){
        int first = 0;
        int end = 1;
        while(target>arr[end]){
            int newfirst = end + 1;
            end = first + (end - first)*2+1;
            first = newfirst;
        }
        return binarysearch(arr,target,first,end);
    }
    static int binarysearch(int[] arr,int target,int start,int end){
        while (start<=end){
            int mid = start + (end - start)/2;
            if(target>arr[mid]){
                start = mid + 1;
            }
            else if(target<arr[mid]){
                end = end - 1;
            }
            else{
                //maybe search element found
                return mid;
            }
        }
        return -1;
    }
}
