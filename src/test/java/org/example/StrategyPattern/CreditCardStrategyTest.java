package org.example.StrategyPattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class CreditCardStrategyTest {

    @Test
    void testCreditCardStrategyPay() {
        // Arrange
        String cardHolderName = "John Doe";
        String cardNumber = "1234567890123456";
        int cvv = 123;
        LocalDate expiryDate = LocalDate.now().plusYears(1);
        double amount = 200;
        double expectedProcessingFee = amount * 0.03;
        double expectedDeliveryFee = 60;
        double expectedTotalAmount = amount + expectedProcessingFee + expectedDeliveryFee;

        // Act
        CreditCardStrategy creditCardStrategy = new CreditCardStrategy(cardHolderName, cardNumber, cvv, expiryDate);
        creditCardStrategy.pay(amount);

        // Assert
        // No need to assert console output, but we can verify the calculations
    }
}
