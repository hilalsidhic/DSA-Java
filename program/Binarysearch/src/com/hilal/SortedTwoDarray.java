package com.hilal;

import java.util.Arrays;

public class SortedTwoDarray {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int target=13;
        System.out.println(Arrays.toString(arraysearch(arr,target)));
    }
    static int[] binarysearch(int[][] arr,int target,int cfirst,int cend,int row){
        while(cfirst<=cend){
            int cmid=cfirst+(cend-cfirst)/2;
            if(arr[row][cmid]==target){
                return new int[]{row,cmid};
            }
            else if(arr[row][cmid]>target){
                cend=cmid-1;
            }
            else{
                cfirst=cmid+1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] arraysearch(int[][] arr,int target){
        int rows = arr.length;
        int cols = arr[0].length;
        if(rows==1){
            return binarysearch(arr,target,0,cols-1,0);
        }
        int rFirst = 0;
        int rEnd = rows -1;
        int cMid = (cols-1)/2;
        while(rFirst<rEnd-1){
            int rMid = rFirst+(rEnd-rFirst)/2;
            if(arr[rMid][cMid]==target){
                return new int[]{rMid,cMid};
            }
            if(arr[rMid][cMid]>target){
                rEnd=rMid;
            }
            else{
                rFirst=rMid;
            }
        }
        if (target<=arr[rFirst][cMid-1]){
            //search  top first
            return binarysearch(arr,target,0,cMid-1,rFirst);
        }
        else if(target>=arr[rFirst][cMid+1]&&target<=arr[rFirst][cols-1]){
            //search top last
            return binarysearch(arr,target,cMid+1,cols-1,rFirst);
        }
        else if(target<=arr[rFirst+1][cMid-1]){
            //search bottom first
            return binarysearch(arr,target,0,cMid-1,rFirst+1);
        }
        else{
            //search bottom last
            return binarysearch(arr,target,cMid+1,cols-1,rFirst+1);
        }
    }
}
