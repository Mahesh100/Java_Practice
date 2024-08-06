package DSA.LinkedList;



//Delete node with specific value : Search for node with specific value and remove it

import java.util.LinkedList;
import  java.util.*;

public class DeleteSpecificNode {

    public static void main(String[] args) {


        LinkedList<String> vehicleList = new LinkedList<String>();
        vehicleList.add("Bus");
        vehicleList.add("Car");
        vehicleList.add("Containers");

        //Delete car from list

    //    vehicleList.remove(1);

        System.out.println(vehicleList);
        String valueToDelete = "Car";

       Iterator<String> iterator = vehicleList.listIterator();

       while(iterator.hasNext()){
           String vehicle = iterator.next();
           if(vehicle.equals(valueToDelete)) {
               iterator.remove();
               break;
           }
       }

        System.out.println(vehicleList);
    }

}
