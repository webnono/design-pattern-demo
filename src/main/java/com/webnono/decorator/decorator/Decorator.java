package com.webnono.decorator.decorator;

import com.webnono.decorator.Drink;

/**
 * Created by Administrator on 2015/12/15.
 */
public class Decorator extends Drink {
    private Drink obj;

    public Decorator(Drink obj){
        this.obj = obj;
    }
    @Override
    public float cost() {
        return super.getPrice()+obj.cost();
    }

    @Override
    public String getDescription() {
        return super.description+super.getPrice()+"&&"+obj.getDescription();
    }
}
