package com.Interfacedemo;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.start();
//        car.stop();
//        car.acc();
        NewCar newcar = new NewCar(new Dieselengine());
        newcar.start();
        newcar.stop();
        newcar.acc();
        newcar.update(new Electricalengine());
        newcar.start();
        newcar.stop();
        newcar.acc();
    }
}
