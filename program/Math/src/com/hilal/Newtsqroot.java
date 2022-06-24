package com.hilal;

public class Newtsqroot {
    public static void main(String[] args) {
        double n = 40;
        System.out.println(sqroot(n));
    }
    public static double sqroot(double n ){
        double x = n;
        while(true){
            double root = 0.5*(x+(n/x));
            if(Math.abs(root-x)<0.01){
                return root;
            }
            x=root;
        }
    }
}
