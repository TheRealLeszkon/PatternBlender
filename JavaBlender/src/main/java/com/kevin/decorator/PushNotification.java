package com.kevin.decorator;

public class PushNotification implements Notification {

    @Override
    public void send() {
        System.out.println("Push Notification Sent!");
    }
}
