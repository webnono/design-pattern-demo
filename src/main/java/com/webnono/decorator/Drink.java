package com.webnono.decorator;

/**
 * Created by Administrator on 2015/12/15.
 */
public abstract class Drink {

    public String description;
    private float price = 0f;

    public String getDescription() {
        return description + this.price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public abstract float cost();
}
