package com.webnono.template;

/**
 * Created by Administrator on 2015/12/17.
 */
public class Tea extends DrinkTemplate {

    @Override
    public void addCondition() {
        System.out.println("放点特级茶叶");
    }
}
