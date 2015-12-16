package com.webnono.command.model;

/**
 * Created by Administrator on 2015/12/16.
 */
public class Light {
    private String lightType;

    public Light(String lightType){
        this.lightType = lightType;
    }
    public void on(){
        System.out.println(lightType+"灯光打开");
    }

    public void off(){
        System.out.println(lightType+"灯光关闭");
    }
}
