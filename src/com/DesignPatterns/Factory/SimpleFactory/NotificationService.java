package DesignPatterns.Factory.SimpleFactory;

import DesignPatterns.Factory.SimpleFactory.Notification;
import DesignPatterns.Factory.SimpleFactory.NotificationFactory;

public class NotificationService {
    public static void main(String[] args)
    {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("push");
        notification.notifyUser();
    }
}
