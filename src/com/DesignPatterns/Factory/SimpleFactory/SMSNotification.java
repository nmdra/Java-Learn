package DesignPatterns.Factory.SimpleFactory;

import DesignPatterns.Factory.SimpleFactory.Notification;

public class SMSNotification implements Notification {

    @Override
    public void notifyUser()
    {
        System.out.println("Sending an SMS notification");
    }
}
