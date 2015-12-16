package com.webnono.command.command.impl;

import com.webnono.command.command.Command;
import com.webnono.command.model.Light;

/**
 * Created by Administrator on 2015/12/16.
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    public void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }
}
