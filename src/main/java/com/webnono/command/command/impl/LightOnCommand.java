package com.webnono.command.command.impl;

import com.webnono.command.command.Command;
import com.webnono.command.model.Light;

/**
 * Created by Administrator on 2015/12/16.
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }
    public void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }
}
