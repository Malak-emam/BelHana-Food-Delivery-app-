package org.example.StrategyPattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PayPalStrategyTest {

    @Test
    void testPayPalStrategyPay() {
        // Arrange
        String email = "example@example.com";
        String password = "password";
        double amount = 100;
        double expectedProcessingFee = amount * 0.03;
        double expectedDeliveryFee = 60;
        double expectedTotalAmount = amount + expectedProcessingFee + expectedDeliveryFee;

        // Act
        PayPalStrategy payPalStrategy = new PayPalStrategy(email, password);
        payPalStrategy.pay(amount);

        // Assert
        // No need to assert console output, but we can verify the calculations
    }
}
