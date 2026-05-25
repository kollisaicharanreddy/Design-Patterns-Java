package creational.notification;

public class Main {

    public static void main(String[] args) {

        Notification notification1 =
                NotificationFactory.createNotification("EMAIL");

        notification1.send("Welcome to the platform");

        Notification notification2 =
                NotificationFactory.createNotification("SMS");

        notification2.send("Your OTP is 4589");

        Notification notification3 =
                NotificationFactory.createNotification("PUSH");

        notification3.send("You have a new message");
    }
}