package SOLID.Liskov_Substitution.WithoutLSP;

import java.util.ArrayList;
import java.util.List;

public class MainClient {

    public static void main(String [] args){

        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new MotorCycle());
        vehicleList.add(new Car());
        vehicleList.add(new Bicycle());

        for(Vehicle vehicle: vehicleList){
            System.out.println(vehicle.hasEngine());   //This will throw nullPointer exception if used toString() method as Bicycle don't have engine and
                                                        // this code not following LSP
        }
    }
}
