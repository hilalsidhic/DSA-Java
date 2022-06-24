package com.hilal;

public class Squareroot {
    public static void main(String[] args) {
        int precision = 3;
        int num = 178991;
        System.out.printf("%.3f",sqrt(num,precision));
    }
    public static double sqrt(int n,int p){
        int first =0;
        int end = n;
        double root=0.0;
        while (first<=end){
            int mid = first + (end-first)/2;
            if(mid*mid==n)
                return mid;
            else if(mid*mid<n)
                first=mid+1;
            else
                end=mid-1;
        }

        double precision = 0.1;
        for (int i = 0; i < p; i++) {
            while (root*root<=n){
                root+=precision;
            }
            root-=precision;
            precision/=10;
        }
        return root;
    }
}
