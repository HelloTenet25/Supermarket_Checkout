package com.company;

public class BuyNGetOneFree extends Item{
    private int quanity;

    public BuyNGetOneFree(String name, double price,int quanity) {
        super(name, price);
        this.quanity=quanity;
    }

    @Override
    public double getPrice() {
        return super.getPrice()*quanity;
    }
}
