package org.example.AdapterPattern;

public interface PaymentGateway {
    void initializePayment(double amount);
    void finalizePayment(String paymentId);
    void cancelPayment(String paymentId);
}