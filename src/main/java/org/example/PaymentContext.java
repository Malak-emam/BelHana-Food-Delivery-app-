package org.example;

public class PaymentContext {
    private PaymentStrategy strategy;

    public PaymentContext(){
    }

    public void setStrategy(PaymentStrategy strategy){
        this.strategy = strategy;
    }

    public void processPayment(double amount){
        strategy.pay(amount);
    }
}
