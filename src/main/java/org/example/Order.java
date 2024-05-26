package org.example;
import java.time.LocalDate;
import java.util.List;

public class Order {
    private int orderID;
    public String customerName;
    public String customerID;
    public List<Item> Items;
    public LocalDate orderDate;
    public String status;
    public int quantity;
    public double totalPayment;
    public String paymentMethod;
    public LocalDate deliveryDate;
    public String paymentStatus;
    public String shippingAddress;

    public Order() {
    }

    public int getOrderID(int customerID) {
        // TODO implement here
        return 0;
    }

    public Item getItems(int orderID) {
        // TODO implement here
        return null;
    }

    public double getTotalAmount(int orderID) {
        // TODO implement here'
        return totalPayment;
    }

    public String getStatus(int orderID) {
        // TODO implement here
        return null;
    }

    public void setItems(int orderID, List<Item> Items) {
        // TODO implement here
    }

    public void setTotalAmount(int orderID, int totalPayment) {
        // TODO implement here
    }

    public void setStatus(int orderID, String status) {
        // TODO implement here
    }

    public void updateStatus(int orderID, String status) {
        // TODO implement here
    }

    public String getPaymentStatus(int orderID) {
        // TODO implement here
        return null;
    }

    public void setPaymentStatus(int orderID, String paymentStatus) {
        // TODO implement here
    }

    public void cancelPayment(int orderID) {
        // TODO implement here
    }

    public void processPayment(int orderID) {
        // TODO implement here
    }

    public String getShippingAddress(int orderID) {
        // TODO implement here
        return null;
    }


    public void setShippingAddress(int orderID, String shippingAddress) {
        // TODO implement here
    }

    public void calculateShippingAddress(int orderID) {
        // TODO implement here
    }

    public LocalDate getOrderDate(int orderID) {
        // TODO implement here
        return null;
    }

    public void setOrderDate(int orderID, LocalDate orderDate) {
        // TODO implement here
    }

    public LocalDate getDeliveryDate(int orderID) {
        // TODO implement here
        return null;
    }

    public void setDeliveryDate(int orderID, LocalDate deliveryDate) {
        // TODO implement here
    }

    public void setPaymentMethod(int customerID, int orderID, String paymentMethod) {
        // TODO implement here
    }

    public String getPaymentMethod(int customerID, int orderID) {
        // TODO implement here
        return null;
    }
}
