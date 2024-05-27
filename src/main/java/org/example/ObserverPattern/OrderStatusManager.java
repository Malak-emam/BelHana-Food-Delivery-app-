package org.example.ObserverPattern;

import org.example.Order;

import java.util.List;

public class OrderStatusManager {
    public OrderStatusManager() {
    }

    /**
     *
     */
    private String status;

    /**
     *
     */
    private List<Observer> observers;

    /**
     * @param status
     */
    public void setStatus(String status) {
        // TODO implement here
    }

    /**
     * @param observer
     */
    public void addObserver(Order observer) {
        // TODO implement here
    }

    /**
     * @param observer
     */
    public void removerObserver(Order observer) {
        // TODO implement here
    }

    /**
     *
     */
    public void notifyObservers() {
        // TODO implement here
    }
}
