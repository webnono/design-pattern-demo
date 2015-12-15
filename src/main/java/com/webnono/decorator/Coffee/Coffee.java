package com.webnono.decorator.Coffee;

import com.webnono.decorator.Drink;

/**
 * Created by Administrator on 2015/12/15.
 */
public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
