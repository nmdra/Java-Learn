package DesignPatterns.Factory.SimpleFactory;

public class NotificationService {
    public static void main(String[] args)
    {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("push");
        notification.notifyUser();
    }
}
