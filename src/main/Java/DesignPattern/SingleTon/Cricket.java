package DesignPattern.SingleTon;

public class Cricket {

    // Eager way of creating singleton pattern
    private static Cricket cricket = new Cricket();

    public static Cricket getCricket(){

        return cricket;
    }



}
