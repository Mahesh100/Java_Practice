package Deepak_tutorial.Abstraction;

public abstract class Vehicle {

    int no_of_tyers;

    abstract void start();

    public static void main(String [] args){

        Car c = new Car();
        c.start();

        scooter s = new scooter();
        s.start();

    }
}
