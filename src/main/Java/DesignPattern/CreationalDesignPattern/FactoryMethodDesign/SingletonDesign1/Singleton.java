package DesignPattern.CreationalDesignPattern.FactoryMethodDesign.SingletonDesign1;

public class Singleton {

    //declare a private static instance of the class type which holds the instance of the class

    private static Singleton instance = new Singleton();

    //Create a private constructor which restrict the instanansitaion of the class from the outside

    private Singleton(){

    }

    //Create public static method which return the instance of the class

    public static Singleton getInstance(){
        return instance;
    }


}
