package org.example.AdapterPattern;

import java.util.Map;

public class PaymentGatewayAdapter implements PaymentGateway {
    private StripePaymentGateway stripePaymentGateway;

    public PaymentGatewayAdapter(StripePaymentGateway stripePaymentGateway) {
        this.stripePaymentGateway = stripePaymentGateway;
    }

    @Override
    public void initializePayment(double amount) {
        // Adapting the StripePaymentGateway method to the PaymentGateway interface
        stripePaymentGateway.createPaymentIntent(amount, null);
    }

    @Override
    public void finalizePayment(String paymentId) {
        // Adapting the StripePaymentGateway method to the PaymentGateway interface
        stripePaymentGateway.confirmPaymentIntent(paymentId);
    }

    @Override
    public void cancelPayment(String paymentId) {
        // Adapting the StripePaymentGateway method to the PaymentGateway interface
        stripePaymentGateway.cancelPaymentIntent(paymentId);
    }
}
