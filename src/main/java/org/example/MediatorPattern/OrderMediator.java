package org.example.MediatorPattern;

import org.example.Order;

import java.util.List;

public class OrderMediator {

    public OrderMediator() {
    }

    /**
     *
     */
    private List<Customer> customers;

    /**
     *
     */
    private List<Restaurant> restaurants;

    /**
     * @param customer customer
     * @param order order
     */
    public void placeOrder(Customer customer, Order order) {
        System.out.println("Mediator: Placing order for customer...");
        notifyRestaurant(order);
        notifyCustomer(order);
    }

    /**
     * @param customer customer
     * @param order order
     */
    public void updateOrder(Customer customer, Order order) {
        System.out.println("Mediator: Updating order for customer...");
        notifyRestaurant(order);
        notifyCustomer(order);
    }

    /**
     * @param customer customer
     * @param order order
     */
    public void cancelOrder(Customer customer, Order order) {
        System.out.println("Mediator: Canceling order for customer...");
        notifyRestaurant(order);
        notifyCustomer(order);
    }

    /**
     * @param order order
     */
    public void notifyCustomer(Order order) {
        System.out.println("Mediator: Notifying customer about order " + order.getOrderID());
    }

    /**
     * @param order order
     */
    public void notifyRestaurant(Order order) {
        System.out.println("Mediator: Notifying restaurant about order " + order.getOrderID());
    }

    /**
     * @param customerName customerName
     * @return
     */
    private Customer getCustomerByName(String customerName) {
        // TODO implement here
        return null;
    }

    /**
     * @param restaurantName restaurantName
     * @return
     */
    private Restaurant getRestaurantByName(String restaurantName) {
        // TODO implement here
        return null;
    }
}
