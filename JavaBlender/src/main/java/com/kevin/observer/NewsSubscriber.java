package com.kevin.observer;

public class NewsSubscriber implements Observer {

    private String subscriberName;

    public NewsSubscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void update(String currentNews) {
        System.out.println("[ " +this.subscriberName+" ]: Received News => "+currentNews);
    }
}
