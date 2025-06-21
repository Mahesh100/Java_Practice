package DesignPattern.BehavioralDesignPattern.StrategyDesigPattern;

public class CreditCardPayment implements PaymentStrategy{
    public void pay(double amount){
        System.out.println("Paid in Rs "+amount+" using Credit card");
    }
}
