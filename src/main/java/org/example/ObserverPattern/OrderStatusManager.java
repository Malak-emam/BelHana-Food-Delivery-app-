package org.example.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class OrderStatusManager {
    private String status;
    private List<Observer> observers;

    public OrderStatusManager() {
        this.observers = new ArrayList<>();
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<Observer> getObservers() {
        return observers;
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(status);
        }
    }
}
