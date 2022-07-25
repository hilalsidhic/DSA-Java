package com.Interfacedemo;

public class Dieselengine implements Engine{
    @Override
    public void start() {
        System.out.println("Start diesel car");
    }

    @Override
    public void stop() {
        System.out.println("stop diesel car");
    }

    @Override
    public void acc() {
        System.out.println("Accelerate diesel car");
    }
}
