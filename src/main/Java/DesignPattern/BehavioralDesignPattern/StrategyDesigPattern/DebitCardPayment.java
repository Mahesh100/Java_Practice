package DesignPattern.BehavioralDesignPattern.StrategyDesigPattern;
/*
* These are the concrete strategies class which implements PaymentStrategy*/
public class DebitCardPayment implements PaymentStrategy{
    public void pay(double amount){
        System.out.println("Paid in Rs "+amount+" using Debit Card.");
    }
}
