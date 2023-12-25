// Concrete Command

package DesignPatterns.Command.Example1.commands;

import DesignPatterns.Command.Example1.components.Light;

public record SwitchLightsCommand(Light light) implements Command {

    @Override
    public void execute() {
        light.switchLights();
    }

}

