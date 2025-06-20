package OPPS.Interface.Example3;

public class UpiPayment implements Payment{
    public void pay(double amount){
        System.out.println("Paid Rs "+ amount+" using UPI");
    }
}
