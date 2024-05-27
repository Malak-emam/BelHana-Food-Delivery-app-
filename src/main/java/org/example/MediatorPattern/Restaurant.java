package org.example.MediatorPattern;

import org.example.Order;

public class Restaurant {

    public Restaurant() {
    }

    /**
     *
     */
    private OrderMediator mediator;

    /**
     * @param mediator mediator
     */
    public void setMediator(OrderMediator mediator) {
        this.mediator = mediator;
    }

    /**
     * @param order order
     */
    public void processOrder(Order order) {
        System.out.println("Restaurant: Processing order " + order.getOrderID());
    }

    /**
     * @param order order
     */
    public void updateOrder(Order order) {
        System.out.println("Restaurant: Updating order " + order.getOrderID());
    }

    /**
     * @param order order
     */
    public void cancelOrder(Order order) {
        System.out.println("Restaurant: Canceling order " + order.getOrderID());
    }
}
