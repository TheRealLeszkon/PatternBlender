package com.kevin.decorator;

public class EmailNotificationDecorator extends NotificationDecorator{

    public EmailNotificationDecorator(Notification notificationService) {
        super(notificationService);
    }

    @Override
    public void send() {
        super.send();

        System.out.println("Email notification sent!");
    }
}
