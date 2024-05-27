package org.example.ObserverPattern;

public class ObserverMain {
    public static void main(String[] args) {
        // Create an instance of OrderStatusManager (subject)
        OrderStatusManager orderStatusManager = new OrderStatusManager();

        // Create some observers
        Observer order1 = new ObserverOrder(101);
        Observer order2 = new ObserverOrder(102);
        Observer admin1 = new ObserverAdmin("Alice");
        Observer admin2 = new ObserverAdmin("Bob");

        // Register observers with the order status manager
        orderStatusManager.addObserver(order1);
        orderStatusManager.addObserver(order2);
        orderStatusManager.addObserver(admin1);
        orderStatusManager.addObserver(admin2);

        // Change order status and notify observers
        orderStatusManager.setStatus("Processing");
        orderStatusManager.setStatus("Shipped");
        orderStatusManager.setStatus("Delivered");

        // Unregister an observer and change status again
        orderStatusManager.removeObserver(order1);
        orderStatusManager.setStatus("Cancelled");
    }
}