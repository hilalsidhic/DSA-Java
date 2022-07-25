package com.Interfacedemo;

public class NewCar implements Engine,Media{
    Engine neweng;

    public NewCar(Engine neweng) {
        this.neweng = neweng;
    }

    @Override
    public void start() {
        neweng.start();
    }

    @Override
    public void stop() {
        neweng.stop();
    }

    @Override
    public void acc() {
        neweng.acc();
    }

    public void update(Engine engine){
        this.neweng = engine;
    }
}
