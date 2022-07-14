package com.polymorphism;

public class ObjectPrint {
    int num;

    public ObjectPrint(int num) {
        this.num = num;
    }

    @Override
    public String toString(){
        return "num = " + this.num;
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(23);
        System.out.println(obj);
    }
}
