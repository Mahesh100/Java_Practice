package DesignPattern.CreationalDesignPattern.SingleTonDesinPattern;

public class BasicSingleTon {

    private static BasicSingleTon instance;

    private BasicSingleTon(){}

    public static synchronized BasicSingleTon getInstance(){
        if(instance == null){
            instance = new BasicSingleTon();
        }
        return instance;
    }
}
