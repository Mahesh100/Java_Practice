package OPPS.Interface.Example3;

public class CreditCardPayment implements Payment{
    public void pay(double amount){
        System.out.println("Paid Rs "+amount+" using Credit Card");
    }
}
