package com.webnono.decorator.decorator;

import com.webnono.decorator.Drink;

/**
 * Created by Administrator on 2015/12/15.
 */
public class Chocolate extends Decorator {

    public Chocolate(Drink obj){
        super(obj);
        super.setDescription("chocolate");
        super.setPrice(2.0f);
    }

}
