package DesignPatterns.Command.Example1.components;

public class Room extends Component {

    private final Curtains curtains;

    public Room() {
        this.curtains = new Curtains();
    }

    public Curtains getCurtains() {
        return curtains;
    }

    public boolean curtainsOpen() {
        return curtains.isOpen();
    }

}


