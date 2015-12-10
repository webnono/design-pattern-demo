package com.webnono.strategy.behavior.impl;

import com.webnono.strategy.behavior.FlyBehavior;

/**
 * 只能向上飞的鸭子
 * Created by Administrator on 2015/12/10.
 */
public class FlyDownBehavior implements FlyBehavior {

    public void fly() {
        System.out.println("我只能往下飞");
    }
}
