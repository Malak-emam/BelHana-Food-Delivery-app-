package org.example.MediatorPattern;

import org.example.Order;

public class MediatorMain {
    public static void main(String[] args) {
        // Initialize the mediator
        OrderMediator orderMediator = new OrderMediator();

        // Initialize a customer and a restaurant
        Customer customer = new Customer();
        Restaurant restaurant = new Restaurant();

        // Set the mediator for the customer and the restaurant
        customer.setMediator(orderMediator);
        restaurant.setMediator(orderMediator);

        // Create an order
        Order order = new Order();
        order.setOrderID(1); // Assuming Order class has this method
        order.setOrderDetails("Pizza, Coke"); // Assuming Order class has this method

        // Place the order using the mediator
        System.out.println("Placing order...");
        orderMediator.placeOrder(customer, order);

        // Update order using the mediator
        System.out.println("Updating order...");
        order.setOrderDetails("Pizza, Coke, Garlic Bread");
        orderMediator.updateOrder(customer, order);

        // Cancel order using the mediator
        System.out.println("Canceling order...");
        orderMediator.cancelOrder(customer, order);
    }
}

