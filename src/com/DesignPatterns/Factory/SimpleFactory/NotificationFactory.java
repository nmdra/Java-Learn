package DesignPatterns.Factory.SimpleFactory;

public class NotificationFactory {
    public Notification createNotification(String channel)
    {
        if (channel == null || channel.isEmpty())
            return null;
//        return switch (channel) {
//            case "SMS" -> new SMSNotification();
//            case "EMAIL" -> new EmailNotification();
//            case "PUSH" -> new PushNotification();
//            default -> throw new IllegalArgumentException("Unknown channel " + channel);
//        };

        if(channel.equalsIgnoreCase("SMS")){
           return new SMSNotification();
        } else if (channel.equalsIgnoreCase("EMAIL")) {
            return new EmailNotification();
        } else if (channel.equalsIgnoreCase("Push")) {
            return new PushNotification();
        } else {
            throw new IllegalArgumentException("Unknown Channel " + channel);
        }

//        switch (channel) {
//            case "SMS":
//                return new SMSNotification();
//            case "EMAIL":
//                return new EmailNotification();
//            case "PUSH":
//                return new PushNotification();
//            default:
//                throw new IllegalArgumentException("Unknown channel "+channel);
//        }
    }
}
