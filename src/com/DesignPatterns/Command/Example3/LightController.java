package DesignPatterns.Command.Example3;

public class LightController {
    private Command LightOn;
    private Command LightOff;

    void setCommand(Command lightOn, Command lightOff) {
        this.LightOn = lightOn;
        this.LightOff = lightOff;
    }

    void lightOn() {
        LightOn.execute();
    }

    void lightOff(){
        LightOn.execute();
    }
}
