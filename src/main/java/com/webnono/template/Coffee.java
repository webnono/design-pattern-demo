package com.webnono.template;

/**
 * Created by Administrator on 2015/12/17.
 */
public class Coffee extends DrinkTemplate {

    @Override
    public void addCondition() {
        System.out.println("添加奶糖");
    }

    public void hook(){
        System.out.println("杯子是一次性的，使用后要扔到垃圾桶");
    }
}
