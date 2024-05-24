package org.example;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate expiryDate = LocalDate.of(2022, 12, 15);
        PaymentContext paymentContext = new PaymentContext();
        paymentContext.setStrategy(new CreditCardStrategy("Shaden El Naggar","1589-4586-1526-8450", 588, expiryDate));
        paymentContext.processPayment(100);

        PaymentContext paymentContextPP = new PaymentContext();
        paymentContextPP.setStrategy(new PayPalStrategy("shadenelnag@gmail.com","12345"));
        paymentContextPP.processPayment(100);
    }
}