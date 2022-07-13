package com.inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);
        this.weight = weight;
    }

    public BoxWeight(BoxWeight b, double weight) {
        super(b);
        this.weight = weight;
    }
}
