package SOLID.SingleResponsibilityPrinciple;

import org.jetbrains.annotations.NotNull;

public class BankService_0 {

    public long deposit(long Amount, String accountNo){
        //do deposit
        return 0;
    }

    public long  withDraw(long Amount,String accountNo){
        // withDraw amount

        return 0;
    }

    public void printPassBook(String accountNo){
            //update transaction info in passbook
    }

    public void getLoanInterestInfo(@NotNull String loanType){
        if(loanType.equals("Home")){
            //calculate loan interest for home
        }
        if(loanType.equals("personalLoan")){
            //calculate interest for personal loan
        }
        if(loanType.equals("car")){
            //calculate interest for car loan
        }
    }

    public void sendOtp(String medium){
        if(medium.equals("Email")){

        }
    }
}
