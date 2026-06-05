package com.kevin.decorator;

public abstract class NotificationDecorator implements Notification{

    private Notification notificationService;

    public NotificationDecorator(Notification notificationService){
        this.notificationService =notificationService;
    }
    @Override
    public void send() {
        notificationService.send();
        System.out.println("-*--Decorator used--*-");
    }
}
