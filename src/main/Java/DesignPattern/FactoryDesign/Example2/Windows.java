package DesignPattern.FactoryDesign.Example2;

public class Windows implements OperatingSystem{
    @Override
    public void specification() {
        System.out.println("This runs on desktop");

    }
}
