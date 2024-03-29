package Loops.ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListAnimals {

    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<String>();

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Rat");

        System.out.println(animals);  //This will print collection object


        //Using Simple for loop

//        for(int i=0; i<animals.size(); i++)
//        {
//
//            String animal = animals.get(i);
//            System.out.print(animal+",");
//        }

        // Using For-each loop

        for (String animal: animals)
        {
            System.out.println(animal);
        }
    }
}
