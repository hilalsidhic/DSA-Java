package com.Interfacedemo;

public class Car implements Engine,Media{
    @Override
    public void start() {
        System.out.println("Start engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop engine");
    }

    @Override
    public void acc() {
        System.out.println("Accelerate car");
    }
}
