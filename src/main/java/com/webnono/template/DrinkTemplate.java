package com.webnono.template;

/**
 * Created by Administrator on 2015/12/17.
 */
public abstract class DrinkTemplate {

    public void doWithDrink(){

        boilWater();
        getCup();
        addCondition();
        hook();
    }

    public void boilWater(){
        System.out.println("正在烧水");
    }

    public void getCup(){
        System.out.println("正在取杯子");
    }

    public abstract void addCondition();
    public void hook(){

    }
}
