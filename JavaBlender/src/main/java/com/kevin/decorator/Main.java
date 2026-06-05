package com.kevin.decorator;

public class Main {
    public static void main(String[] args) {
//        Notification notification = new SMSNotificationDecorator(
//                new EmailNotificationDecorator(
//                        new PushNotification()
//                )
//        );
        Notification notification = new EmailNotificationDecorator(
                new PushNotification()
        );
        notification.send();

        //Refactor this later. This works but aint really the bset example.
        //Try to give an example where tasks flow into eachother and perform differnct activities.
        // Eg: Auth -> RateLimit -> Logging
    }
}
