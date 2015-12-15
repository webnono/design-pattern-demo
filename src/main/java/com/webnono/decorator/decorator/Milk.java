package com.webnono.decorator.decorator;

import com.webnono.decorator.Drink;

/**
 * Created by Administrator on 2015/12/15.
 */
public class Milk extends Decorator {

    public Milk(Drink obj){
        super(obj);
        super.setDescription("milk");
        super.setPrice(1.0f);
    }
}
