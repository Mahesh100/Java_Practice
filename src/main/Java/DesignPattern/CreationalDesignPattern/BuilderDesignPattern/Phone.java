package DesignPattern.CreationalDesignPattern.BuilderDesignPattern;

public class Phone {

    private String os;
    private  int RAM;
    private  String company;
    private double screenSize;
    private int battery;

    public Phone(String os, int RAM, String company, double screenSize, int battery){
        this.os = os;
        this.RAM =RAM;
        this.company = company;
        this.screenSize = screenSize;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", RAM=" + RAM +
                ", company='" + company + '\'' +
                ", screenSize=" + screenSize +
                ", battery=" + battery +
                '}';
    }
}

