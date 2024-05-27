package org.example;

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
    public  void placeOrder( Customer customer,  Order order) {
        // TODO implement here
    }

    /**
     * @param customer customer
     * @param order order
     */
    public void  updateOrder( Customer customer,  Order order) {
        // TODO implement here
    }

    /**
     * @param customer customer
     * @param order order
     */
    public  void cancelOrder( Customer customer,  Order order) {
        // TODO implement here
    }

    /**
     * @param order order
     */
    public  void notifyCustomer( Order order) {
        // TODO implement here
    }

    /**
     * @param order order
     */
    public void  notifyRestaurant( Order order) {
        // TODO implement here
    }

    /**
     * @param customerName customerName
     */
    private  Customer getCustomerByName( String customerName) {
        // TODO implement here
        return null;
    }

    /**
     * @param restaurantName restaurantName
     */
    private  Restaurant getRestaurantByName( String restaurantName) {
        // TODO implement here
        return null;
    }
}
