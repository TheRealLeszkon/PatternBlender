package com.kevin.observer;

import java.util.List;

public interface Observable {
    public void add(Observer observer);
    public void remove(Observer observer);
    public void notifyObservers();

}
