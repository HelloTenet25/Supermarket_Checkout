package com.company;

public class MultipricedItem extends  Item{
    private int quantity;
    private double discountedPrice;
    public MultipricedItem(String name, double price,int quantity,double discountedPrice) {
        super(name, price);
        this.quantity=quantity;
        this.discountedPrice=discountedPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getDiscountedPrice() {
        return discountedPrice;
    }
}
