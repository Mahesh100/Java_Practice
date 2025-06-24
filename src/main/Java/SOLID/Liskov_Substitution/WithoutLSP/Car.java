package SOLID.Liskov_Substitution.WithoutLSP;

public class Car extends Vehicle {

    @Override
    public Integer getNumberOfWheels(){
        return 4;
    }
}
