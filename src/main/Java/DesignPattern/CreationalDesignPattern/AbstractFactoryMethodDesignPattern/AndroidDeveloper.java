package DesignPattern.CreationalDesignPattern.AbstractFactoryMethodDesignPattern;

public class AndroidDeveloper implements Employee{

    public int salary(){
        return 5000;
    }

    public String name(){
        System.out.println("I am a android developer");
        return "Johan";
    }
}
