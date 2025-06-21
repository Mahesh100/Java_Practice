package DesignPattern.BehavioralDesignPattern.StrategyDesigPattern;

public class UPIPayment implements PaymentStrategy{
    public void pay(double amount){
        System.out.println("Paid in Rs "+amount+" ");
    }
}
