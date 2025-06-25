package DesignPattern.CreationalDesignPattern.BuilderDesignPattern;

public class PhoneBuilder {

    private String os;
    private  int RAM;
    private  String company;
    private double screenSize;
    private int battery;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setRAM(int RAM) {
        this.RAM = RAM;
        return this;
    }

    public PhoneBuilder setCompany(String company) {
        this.company = company;
        return this;
    }

    public PhoneBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public Phone getPhone(){
        return new Phone(os,RAM,company,screenSize,battery);
    }
}
