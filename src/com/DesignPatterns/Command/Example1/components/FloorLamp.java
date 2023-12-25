package DesignPatterns.Command.Example1.components;

public class FloorLamp extends Component {

    private final Light light;

    public FloorLamp() {
        this.light = new Light();
    }

    public Light getLight() {
        return light;
    }

    public boolean isLightOn() {
        return light.isSwitchedOn();
    }

}
