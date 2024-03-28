package Loops.ForEachLoop;

import java.util.Arrays;

public class Animals {

    public static void main(String[] args) {

        String[] animals = {"Dog", "Cat", "Lion"};

        System.out.println("Animals are: "+Arrays.toString(animals));

        for(String animal:animals)
        {
            System.out.println(animal);
        }

//        for(int i=0; i<=animals.length-1; i++){
//            System.out.println(animals[i]);
//        }
    }
}
