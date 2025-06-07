package DesignPattern.FactoryMethodDesign.Example2;

public class FactoryMain {

    public static void main(String[] args) {

        OperatingSystem operatingSystem = new Android();
        operatingSystem.specification();

        OperatingSystem operatingSystem1 = new Windows();

    }
}
