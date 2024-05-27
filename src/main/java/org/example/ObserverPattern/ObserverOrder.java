package org.example.ObserverPattern;

public class ObserverOrder implements Observer {
    private int orderId;

    public ObserverOrder(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public void update(String status) {
        System.out.println("Order " + orderId + " status updated to: " + status);
    }
}