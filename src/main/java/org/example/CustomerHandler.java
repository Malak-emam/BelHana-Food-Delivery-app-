package org.example;

import java.util.Date;

public class CustomerHandler {

    public CustomerHandler() {
    }

    /**
     * @param name
     * @param email
     * @param password
     * @param phone
     */
    public void createCustomer(String name, String email, String password, String phone) {
        // TODO implement here
    }

    /**
     * @param customerID
     */
    public void updateCustomer(int customerID) {
        // TODO implement here
    }

    /**
     * @param customerID
     */
    public void getCustomer(int customerID) {
        // TODO implement here
    }

    /**
     * @param customerID
     */
    public void deleteCustomer(int customerID) {
        // TODO implement here
    }

    /**
     * @param customerID
     * @param street
     * @param apartment
     * @param city
     * @param state
     * @param pCode
     */
    public void createAddress(int customerID, int street, int apartment, String city, String state, int pCode) {
        // TODO implement here
    }

    /**
     * @param customerID
     * @param ccNo
     * @param ccDate
     */
    public void createAccount(int customerID, int ccNo, Date ccDate) {
        // TODO implement here
    }
}
