package creational.factory;

public class NotificationFactory {

    public static Notification createNotification(String type) {

        if (type == null) {
            return null;
        }

        switch (type.toUpperCase()) {

            case "EMAIL":
                return new EmailNotification();

            case "SMS":
                return new SMSNotification();

            case "PUSH":
                return new PushNotification();

            default:
                throw new IllegalArgumentException(
                        "Invalid notification type"
                );
        }
    }
}