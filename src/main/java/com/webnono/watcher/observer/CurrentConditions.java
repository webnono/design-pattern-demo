package com.webnono.watcher.observer;

/**
 * Created by Administrator on 2015/12/11.
 */
public class CurrentConditions implements Observer {

    private int temprature;

    public void update(int temprature) {
        this.temprature = temprature;
        display();
    }

    public void display(){
        System.out.println("目前室外的温度是："+temprature);
    }
}
