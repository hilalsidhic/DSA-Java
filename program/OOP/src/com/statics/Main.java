package com.statics;

public class Main {
    public static void main(String[] args) {
        People hilal = new People(10,1212,false);
        People nolito = new People(11,1213,true);
        System.out.println(People.population);
    }
}
class People{
    int num;
    int people;
    boolean married;
    static int population;

    public People(int num, int people, boolean married) {
        this.num = num;
        this.people = people;
        this.married = married;
        People.population += 1;
    }
}
