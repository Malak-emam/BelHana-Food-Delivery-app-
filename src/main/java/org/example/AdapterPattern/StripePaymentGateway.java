package org.example.AdapterPattern;

import java.util.Map;

public class StripePaymentGateway {
    public StripePaymentGateway() {}

    public void createPaymentIntent(double amount, Map<String, String> params) {
        // Simulate creating a payment intent with Stripe
        System.out.println("Stripe: Creating payment intent for amount: " + amount);
    }

    public void confirmPaymentIntent(String paymentId) {
        // Simulate confirming a payment intent with Stripe
        System.out.println("Stripe: Confirming payment intent with ID: " + paymentId);
    }

    public void cancelPaymentIntent(String paymentId) {
        // Simulate canceling a payment intent with Stripe
        System.out.println("Stripe: Canceling payment intent with ID: " + paymentId);
    }
}