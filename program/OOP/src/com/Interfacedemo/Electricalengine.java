package com.Interfacedemo;

public class Electricalengine implements Engine{
    @Override
    public void start() {
        System.out.println("Start Electrical engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop Electrical engine");
    }

    @Override
    public void acc() {
        System.out.println("Accelerate electrical engine");
    }
}
