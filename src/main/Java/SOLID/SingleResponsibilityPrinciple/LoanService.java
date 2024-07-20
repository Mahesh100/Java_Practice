package SOLID.SingleResponsibilityPrinciple;

import org.jetbrains.annotations.NotNull;

public class LoanService {

    public void getInterestInfo(@NotNull String loanType){
        if(loanType.equals("Home")){

        }
        if (loanType.equals("personalLoan")){

        }
        if(loanType.equals("car"))
        {
            //logic for car loan
        }
    }

}
