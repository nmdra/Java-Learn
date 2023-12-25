// Concrete Command

package DesignPatterns.Command.Example1.commands;

import DesignPatterns.Command.Example1.components.Curtains;

public record OpenCloseCurtainsCommand(Curtains curtains) implements Command {

    @Override
    public void execute() {
        curtains.openClose();
    }

}
