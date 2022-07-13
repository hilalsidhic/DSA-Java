package com.inheritance;

public class BoxPrice extends BoxWeight{
    double price;

    public BoxPrice(double l, double h, double w, double weight, double price) {
        super(l, h, w, weight);
        this.price = price;
    }

    public BoxPrice(BoxPrice b, double weight, double price) {
        super(b, weight);
        this.price = price;
    }
}
