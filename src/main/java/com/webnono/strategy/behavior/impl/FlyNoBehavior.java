package com.webnono.strategy.behavior.impl;

import com.webnono.strategy.behavior.FlyBehavior;

import java.awt.datatransfer.FlavorListener;

/**
 * 不能飞的
 * Created by Administrator on 2015/12/10.
 */
public class FlyNoBehavior implements FlyBehavior {

    public void fly() {
        System.out.println("我不能飞，但我的梦想是翱翔");
    }
}
