package com.webnono.command.controller.impl;

import com.webnono.command.command.Command;
import com.webnono.command.command.impl.NoCommand;
import com.webnono.command.controller.Controller;

import java.util.Stack;

/**
 * Created by Administrator on 2015/12/16.
 */
public class CommandModeContorller implements Controller {

    private Command[] onCommands;
    private Command[] offCommands;
    Stack<Command> commandStack = new Stack<Command>();

    public CommandModeContorller(){
        onCommands = new Command[5];
        offCommands = new Command[5];

        Command noCommand = new NoCommand();

        for (int i = 0,len = onCommands.length;i<len;i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot,Command onCommand,Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButton(int slot) {
        onCommands[slot].execute();
        commandStack.push(onCommands[slot]);
    }


    public void offButton(int slot) {
        offCommands[slot].execute();
        commandStack.push(offCommands[slot]);
    }

    public void undoButton() {
        commandStack.pop().undo();
    }
}
