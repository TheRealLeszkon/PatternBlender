package com.kevin.decorator;

public class SMSNotificationDecorator extends NotificationDecorator{
    public SMSNotificationDecorator(Notification notificationService) {
        super(notificationService);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("SMS Notification Sent!");
    }
}
