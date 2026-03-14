package com.kevin.observer;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class NewsStation implements Observable{

    private final List<Observer> observerList =new ArrayList<>();

    @Getter
    @Setter
    private String currentNews;

    public NewsStation(String currentNews) {
        this.currentNews = currentNews;
    }

    @Override
    public void add(Observer observer) {
        observerList.add(observer);
        System.out.println("A new subscriber was gained. Current Subscriber count is "+observerList.size());
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
        System.out.println("A subscriber was lost. Current Subscriber count is "+observerList.size());
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observerList){
            observer.update(this.currentNews);
        }
    }


}
