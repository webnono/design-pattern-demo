package com.webnono.strategy.Model;

import com.webnono.strategy.behavior.FlyBehavior;

/**
 * 定义一个主体类鸭子
 * Created by Administrator on 2015/12/10.
 */
public abstract class Duck {

    public FlyBehavior flyBehavior;

    public Duck(){}

    public void fly(){
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public abstract void display();
}
