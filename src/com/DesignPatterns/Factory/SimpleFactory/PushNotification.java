package DesignPatterns.Factory.SimpleFactory;

import DesignPatterns.Factory.SimpleFactory.Notification;

public class PushNotification implements Notification {

    @Override
    public void notifyUser()
    {
        System.out.println("Sending a push notification");
    }
}
