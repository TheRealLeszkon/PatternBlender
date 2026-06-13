package com.kevin.command;

import java.awt.*;
import java.util.Map;
import java.util.Stack;

public class ColorCommandInvoker {
    private final Stack<Command> executedCommands = new Stack<>();

    public void executeCommand(Command command){
        executedCommands.add(command);
        command.execute();
    }
    public void unexecuteCommand(){
        if(!executedCommands.empty()){
            executedCommands.pop().unexecute();
        }
    }

}
