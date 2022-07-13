package com.inheritance;

public class Box {
    double l;
    double h;
    double w;

     Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }
    Box (){
         this.l = -1;
         this.h = -1;
         this.w = -1;
    }
    Box(double n){
        this.l = n;
        this.h = n;
        this.w = n;
    }
    Box(Box b){
        this.l = b.l;
        this.h = b.h;
        this.w = b.w;
    }
    public void getinfo(){
        System.out.println("Info is running");
    }
}
