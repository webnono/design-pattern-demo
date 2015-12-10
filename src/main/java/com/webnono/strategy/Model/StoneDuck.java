package com.webnono.strategy.Model;

import com.webnono.strategy.behavior.FlyBehavior;
import com.webnono.strategy.behavior.impl.FlyNoBehavior;

/**
 * Created by Administrator on 2015/12/10.
 */
public class StoneDuck extends Duck{


    public StoneDuck(){
        flyBehavior = new FlyNoBehavior();
    }
    @Override
    public void display() {
        System.out.println("我的外观就是一个石头");
    }
}
