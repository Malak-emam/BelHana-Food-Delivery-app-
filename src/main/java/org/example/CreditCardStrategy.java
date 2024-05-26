package org.example;
import java.time.LocalDate;

public class CreditCardStrategy implements PaymentStrategy{
    private String cardHolderName;
    private String cardNumber;
    private int cvv;
    private LocalDate expiryDate;

    public CreditCardStrategy(String cardHolderName, String cardNumber, int cvv, LocalDate expiryDate){
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(double amount) {
        double processingFee = amount * 0.03;
        double deliveryFee = 60;
        double totalAmount = amount + processingFee + deliveryFee;
        System.out.println("Processing credit card payment...");
        System.out.println("Transaction Amount: EGP " + amount);
        System.out.println("Processing Fee: EGP " + processingFee);
        System.out.println("Delivery Fee: EGP " + deliveryFee);
        System.out.println("Total Amount: EGP " + totalAmount);
        System.out.println("Paid EGP " + amount + " using Credit Card\n");
    }
}
