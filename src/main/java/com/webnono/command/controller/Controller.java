package com.webnono.command.controller;

/**
 * Created by Administrator on 2015/12/16.
 */
public interface Controller {

    void onButton(int slot);
    void offButton(int slot);
    void undoButton();
}
