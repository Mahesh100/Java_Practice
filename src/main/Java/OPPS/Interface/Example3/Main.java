package OPPS.Interface.Example3;

public class Main {
    public static void main(String [] args){
        UpiPayment upiPayment = new UpiPayment();
        DebitCard debitCard = new DebitCard();
        CreditCardPayment creditCardPayment = new CreditCardPayment();

        upiPayment.pay(101.1);
        debitCard.pay(102.1);
        creditCardPayment.pay(103.1);
    }
}
