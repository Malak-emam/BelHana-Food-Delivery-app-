package org.example;

import java.util.List;

public class CartHandler {

    /**
     * Default constructor
     */
    public CartHandler() {
    }

    /**
     * @param itemID
     * @param supplierName
     * @param quantity
     * @param price
     */
    public void addItemToCart(int itemID, String supplierName, int quantity, int price) {
        // TODO implement here
    }

    /**
     * @param itemID
     */
    public void removeItemFromCart(int itemID) {
        // TODO implement here
    }

    /**
     * @param itemID
     */
    public void updateCartQuantity(int itemID) {
        // TODO implement here
    }

    /**
     * @param customerID
     * @return
     */
    public List<Item> getAllItems(int customerID) {
        // TODO implement here
        return null;
    }

    /**
     * @param customerID
     */
    public void clearCart(int customerID) {
        // TODO implement here
    }

}
