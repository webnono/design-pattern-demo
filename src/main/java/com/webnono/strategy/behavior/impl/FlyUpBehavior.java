package com.webnono.strategy.behavior.impl;

import com.webnono.strategy.behavior.FlyBehavior;

/**
 * 向上飞的鸭子
 * Created by Administrator on 2015/12/10.
 */
public class FlyUpBehavior implements FlyBehavior {

    public void fly() {
        System.out.println("我是一只能向上飞的鸭子");
    }
}
