package com.webnono.command.controller.impl;

import com.webnono.command.command.impl.LightOffCommand;
import com.webnono.command.command.impl.LightOnCommand;
import com.webnono.command.model.Light;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2015/12/16.
 */
public class CommandModeContorllerTest {

    @Test
    public void testController(){
        CommandModeContorller commandModeContorller = new CommandModeContorller();

        commandModeContorller.setCommand(0,new LightOnCommand(new Light("卧室灯")),new LightOffCommand(new Light("客厅灯")));
        commandModeContorller.setCommand(1, new LightOnCommand(new Light("室灯")), new LightOffCommand(new Light("厅灯")));
        commandModeContorller.setCommand(3,new LightOnCommand(new Light("灯")),new LightOffCommand(new Light("灯")));

        commandModeContorller.onButton(0);
        commandModeContorller.onButton(1);
        commandModeContorller.onButton(3);
        commandModeContorller.offButton(3);//开灯操作
        commandModeContorller.undoButton();//撤销操作
        commandModeContorller.undoButton();
        commandModeContorller.undoButton();
        commandModeContorller.undoButton();

    }

}