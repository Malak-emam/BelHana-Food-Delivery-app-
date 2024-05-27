package org.example;

import org.example.MediatorPattern.Customer;

import java.util.List;

public class Admin {public Admin() {
}

    /**
     *
     */
    private int adminID;

    /**
     *
     */
    private String name;

    /**
     *
     */
    private String email;

    /**
     * @return
     */
    public boolean Login() {
        // TODO implement here
        return false;
    }

    /**
     * @param username
     * @param password
     * @return
     */
    public Customer createCustomer(String username, String password) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public boolean Logout() {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public boolean ChangeAccountPassword() {
        // TODO implement here
        return false;
    }

    /**
     * @param customerID
     * @param newPasssword
     */
    public void resetPassword(int customerID, String newPasssword) {
        // TODO implement here
    }

    /**
     * @return
     */
    public boolean UpdateCustomerProfile() {
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

     * @return
     */
    public boolean ModifyMenu(Menu newMenu) {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public Menu ViewMenu() {
        // TODO implement here
        return null;
    }

    /**
     * @param customerID
     */
    public void deleteCustomer(int customerID) {
        // TODO implement here
    }

    /**
     * @param customerID
     * @return
     */
    public Customer getCustomer(int customerID) {
        // TODO implement here
        return null;
    }

    /**
     * @param customerID
     */
    public void updateCustomer(int customerID) {
        // TODO implement here
    }

    /**
     * @return
     */
    public List<Customer> getAllCustomers() {
        // TODO implement here
        return null;
    }

    /**
     *
     */
    public void generateReport() {
        // TODO implement here
    }

    /**
     *
     */
    public void viewAnalytics() {
        // TODO implement here
    }

    /**

     * @return
     */
    public boolean DeleteFoodItem(int itemId) {
        // TODO implement here
        return false;
    }

    /**

     * @return
     */
    public boolean AddFoodItem(Item foodItem) {
        // TODO implement here
        return false;
    }
}
