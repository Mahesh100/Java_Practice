package DesignPattern.SingleTon;

public class Sports {

    private static Sports sports;

    private Sports(){

    }

    public static Sports getSports(){

        // Creating object of Sports

        if(sports==null){
            sports = new Sports();
        }
        return sports;
    }
}
