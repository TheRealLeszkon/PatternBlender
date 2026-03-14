package com.kevin.observer;

public class Main {
    public static void main(String[] args) {
        NewsStation CNN = new NewsStation("War at Iran!");
        NewsSubscriber armstrong = new NewsSubscriber("Senator Armstrong");
        NewsSubscriber raiden = new NewsSubscriber("Raiden");
        NewsSubscriber snake =new NewsSubscriber("Leon Pliskin");
        CNN.add(armstrong);
        CNN.add(raiden);
        CNN.add(snake);
        CNN.notifyObservers();
        System.out.println("\n=====AFTER REMOVING ONE OBSERVER=====\n");

        CNN.remove(raiden);
        CNN.setCurrentNews("New Batch of Epstein Files Released.");
        CNN.notifyObservers();
    }
}
