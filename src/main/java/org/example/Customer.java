package org.example;

import java.util.Date;
import java.util.List;

public class Customer {

    public Customer() {
    }

    /**
     *
     */
    private int customerID;



    /**
     * @param OrderMediator mediator
     */

    private  OrderMediator mediator;


    /**
     *
     */
    private String name;

    /**
     *
     */
    private String email;

    /**
     *
     */
    private String password;

    /**
     *
     */
    private String phone;

    /**
     * @param mediator
     */
    public  void setMediator( OrderMediator mediator) {
    // TODO implement here
    }
    /*
     * @param phone
     * @param email
     * @param password
     */

    public void Register(String name, String phone, String email, String password) {
        // TODO implement here
    }

    /**
     * @param email
     * @param password
     * @return
     */
    public boolean Login(String email, String password) {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public List<Item> SearchFood() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Menu ViewMenu() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public List<Category> ViewCategories() {
        // TODO implement here
        return null;
    }

    /**
     * @param category category
     */
    public void SelectCategory(int category) {
        // TODO implement here
    }

    /**
     * @param itemId itemId
     * @return
     */
    public boolean AddItemToFavorites(int itemId) {
        // TODO implement here
        return false;
    }

    /**
     * @param itemId itemId
     * @return
     */
    public boolean AddItemToCart(int itemId) {
        // TODO implement here
        return false;
    }

    /**
     * @param itemId itemId
     */
    public void RemoveItemFromCart(int itemId) {
        // TODO implement here
    }

    /**
     * @param itemId itemId
     */
    public void RemoveItemFromFavorite(int itemId) {
        // TODO implement here
    }

    /**
     * @param customerID
     * @return
     */
    public Item getFavorite(int customerID) {
        // TODO implement here
        return null;
    }

    /**
     * @param customerID
     * @return
     */
    public Item getCart(int customerID) {
        // TODO implement here
        return null;
    }

    /**
     * @param customerID
     * @param orderID
     * @return
     */
    public Order PreviewOrder(int customerID, int orderID) {
        // TODO implement here
        return null;
    }

    /**
     * @param order

     * @return
     */
    public  void placeOrder( Order order) {
        // TODO implement here
    }
    public boolean UpdateOrder(int customerID, int orderID) {
        // TODO implement here
        return false;
    }

    /**
     * @param customerID
     * @param orderID
     * @return
     */

    /**
     * @return
     */
    public boolean CancelOrder() {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public boolean ConfirmOrder() {
        // TODO implement here
        return false;
    }

    /**
     * @param paymentMethod paymentMethod
     * @return
     */
    public boolean MakePayment(String paymentMethod) {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public boolean TrackOrder() {
        // TODO implement here
        return false;
    }

    /**
     * @param orderID
     * @param customerID
     */
    public void SelectPaymentMethod(int orderID, int customerID) {
        // TODO implement here
    }

    /**
     * @param customerID
     * @return
     */
    public boolean Logout(int customerID) {
        // TODO implement here
        return false;
    }

    /**
     * @param CustomerID
     * @return
     */
    public Item ReviewItem(int CustomerID) {
        // TODO implement here
        return null;
    }

    /**
     * @param CustomerID
     * @return
     */
    public Profile ViewProfile(int CustomerID) {
        // TODO implement here
        return null;
    }

    /**
     * @param CustomerID
     * @return
     */
    public Profile EditProfile(int CustomerID) {
        // TODO implement here
        return null;
    }

    /**
     * @param customerID
     * @param itemID
     */
    public void RateItem(int customerID, int itemID) {
        // TODO implement here
    }

    /**
     * @param itemID
     * @return
     */
    public double ViewItemRating(int itemID) {
        // TODO implement here
        return 0.0;
    }

    /**
     * @param customerID
     * @return
     */
    public Order getOrderHistory(int customerID) {
        // TODO implement here
        return null;
    }

    /**
     * @param customerID
     * @param street
     * @param apartment
     * @param city
     * @param state
     * @param pCode
     */
    public void enterAddress(int customerID, int street, int apartment, String city, String state, int pCode) {
        // TODO implement here
    }

    /**
     * @param customerID
     * @param ccNo
     * @param ccDate
     */
    public void enterAccount(int customerID, int ccNo, Date ccDate) {
        // TODO implement here
    }

    /**
     * @return
     */
    public OnlineCart createCart() {
        // TODO implement here
        return null;
    }

    /**
     * @param customerID
     * @param itemID
     */
    public void updateCartItemQuantity(int customerID, int itemID) {
        // TODO implement here
    }

    /**
     * @param customerID
     * @param newPassword
     */
    public void resetPassowrd(int customerID, String newPassword) {
        // TODO implement here
    }
}
