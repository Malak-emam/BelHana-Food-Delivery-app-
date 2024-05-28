package org.example.AdapterPattern;

import java.util.HashMap;
import java.util.Map;

public class MainAdapter {
    public static void main(String[] args) {
        // Create an instance of StripePaymentGateway (adaptee)
        StripePaymentGateway stripePaymentGateway = new StripePaymentGateway();

        // Create an adapter for StripePaymentGateway
        PaymentGateway paymentGatewayAdapter = new PaymentGatewayAdapter(stripePaymentGateway);

        // Create an instance of PaymentProcessor (client) with the adapter
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGatewayAdapter);

        // Process a payment
        double amount = 100.0;
        Map<String, String> params = new HashMap<>();
        params.put("currency", "USD");
        params.put("description", "Test payment");

        paymentProcessor.processPayment(amount, params);

        // Confirm a payment
        String paymentId = "12345";
        paymentProcessor.confirmPayment(paymentId);

        // Cancel a payment
        paymentProcessor.cancelPayment(paymentId);
    }
}
