package org.example.StrategyPattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PaymentContextTest {

    @Test
    void testPayWithPayPalStrategy() {
        // Arrange
        PaymentStrategy payPalStrategy = new PayPalStrategy("example@example.com", "password");
        PaymentContext paymentContext = new PaymentContext();
        paymentContext.setStrategy(payPalStrategy);

        // Act
        // Assuming amount to pay is 100 EGP
        paymentContext.processPayment(100);

        // No need for assertion since this test is for functionality verification
    }

    @Test
    void testPayWithCreditCardStrategy() {
        // Arrange
        PaymentStrategy creditCardStrategy = new CreditCardStrategy(
                "John Doe",
                "1234567890123456",
                123,
                LocalDate.now().plusYears(1)
        );
        PaymentContext paymentContext = new PaymentContext();
        paymentContext.setStrategy(creditCardStrategy);

        // Act
        // Assuming amount to pay is 200 EGP
        paymentContext.processPayment(200);

        // No need for assertion since this test is for functionality verification
    }
}
