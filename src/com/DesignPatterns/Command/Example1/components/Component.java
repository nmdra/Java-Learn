package DesignPatterns.Command.Example1.components;

import DesignPatterns.Command.Example1.commands.Command;

public abstract class Component {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }

}
