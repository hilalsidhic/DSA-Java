package com.hilal;

import java.util.Arrays;

//https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
public class Capacitytoship {
        public static void main(String[] args) {
            int[] weights = {147,73,265,305,191,152,192,293,309,292,182,157,381,287,73,162,313,366,346,47};
            int days = 10;
            System.out.println(shipWithinDays(weights,days));
        }
        public static int shipWithinDays(int[] weights, int days) {
            int max=0;
            int min=weights[0];

            for(int i=0;i<weights.length;i++){
                if(min<weights[i])
                    min=weights[i];
                max+=weights[i];
            }
            if(days==1){
                return max;
            }
            while(min<=max){
                int[] arr=new int[weights.length];
                int sum=0;int dayscount=1;
                int mid = min + (max-min)/2;
                for(int i=0;i<weights.length;i++){
                    if(sum+weights[i]>mid){
                        dayscount++;
                        arr[i]=sum;
                        sum=weights[i];
                    }
                    else{
                        sum+=weights[i];
                    }
                }
                if(dayscount>days){
                    min = mid + 1;
                }
                else if(dayscount<days){
                    max = mid - 1;
                }
                else{
                    System.out.println(Arrays.toString(arr));
                    int ans =arr[0];
                    for (int i = 1; i < arr.length; i++) {
                        if(ans<arr[i]){
                            ans = arr[i];
                        }
                    }
                    return ans;
                }
            }
            return max;
        }
    }

