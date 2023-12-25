package DesignPatterns.Bridge.Example2;

public class Demo {
    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl(new SamsungTV());
        remoteControl.turnOn();

        AdvancedRemoteControl advancedRemoteControl =
                new AdvancedRemoteControl(new SonyTV());
        advancedRemoteControl.setChannel(3);

        advancedRemoteControl.turnOff();
    }
}
