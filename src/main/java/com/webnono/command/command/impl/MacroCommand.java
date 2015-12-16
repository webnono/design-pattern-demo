package com.webnono.command.command.impl;

import com.webnono.command.command.Command;

/**
 * Created by Administrator on 2015/12/16.
 */
public class MacroCommand implements Command {

    Command[] commands;

    public MacroCommand(Command[] commands){
        this.commands = commands;

    }
    public void execute() {
        for (int i = 0 ; i<commands.length;i++){
            commands[i].execute();
        }
    }

    public void undo() {
        for (int len =  commands.length - 1;len > -1 ; len--){
            commands[len].undo();
        }
    }
}
