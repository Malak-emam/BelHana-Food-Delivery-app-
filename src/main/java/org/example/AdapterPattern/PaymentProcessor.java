package org.example.AdapterPattern;

import java.util.Map;

public class PaymentProcessor {
    private PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void processPayment(double amount, Map<String, String> params) {
        paymentGateway.initializePayment(amount);
    }

    public void confirmPayment(String paymentId) {
        paymentGateway.finalizePayment(paymentId);
    }

    public void cancelPayment(String paymentId) {
        paymentGateway.cancelPayment(paymentId);
    }
}