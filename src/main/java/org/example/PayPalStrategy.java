package org.example;

public class PayPalStrategy implements PaymentStrategy{
    private String email;
    private String password;

    public PayPalStrategy(String email, String password){
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(double amount) {
        double processingFee = amount * 0.03;
        double deliveryFee = 60;
        double totalAmount = amount + processingFee + deliveryFee;
        System.out.println("Processing PayPal payment...");
        System.out.println("Transaction Amount: EGP " + amount);
        System.out.println("Processing Fee: EGP " + processingFee);
        System.out.println("Delivery Fee: EGP " + deliveryFee);
        System.out.println("Total Amount: EGP " + totalAmount);
        System.out.println("Paid EGP " + amount + " via PayPal using email " + email +"\n");
    }
}
