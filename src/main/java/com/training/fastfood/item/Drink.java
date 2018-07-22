package com.training.fastfood.item;

public abstract class Drink implements Item {

    protected String shortName;
    protected String fullName;
    protected int calories;
    protected float price;

    @Override
    public String getShortName() {
        return shortName;
    }

    @Override
    public String getFullName() {
        return fullName;
    }

    @Override
    public int getCalories() {
        return calories;
    }

    @Override
    public float getPrice() {
        return price;
    }
}
