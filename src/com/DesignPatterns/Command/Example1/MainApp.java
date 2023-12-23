package DesignPatterns.Command.Example1;

import DesignPatterns.Command.Example1.commands.OpenCloseCurtainsCommand;
import DesignPatterns.Command.Example1.commands.SwitchLightsCommand;
import DesignPatterns.Command.Example1.components.FloorLamp;
import DesignPatterns.Command.Example1.components.Room;

public class MainApp {
    /**
     * Video Reference: <a href="https://youtu.be/UfGD60BYzPM">...</a>
     */
    public static void main(String[] args) {

        Room room = new Room();
        room.setCommand(new OpenCloseCurtainsCommand(room.getCurtains()));
        room.executeCommand();
        System.out.println(room.curtainsOpen());

        System.out.println("==========================================");

        FloorLamp lamp = new FloorLamp();
        lamp.setCommand(new SwitchLightsCommand(lamp.getLight()));
        lamp.executeCommand();
        System.out.println(lamp.isLightOn());

    }

}
