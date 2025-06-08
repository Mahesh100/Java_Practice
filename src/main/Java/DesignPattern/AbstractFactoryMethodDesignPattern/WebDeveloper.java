package DesignPattern.AbstractFactoryMethodDesignPattern;

public class WebDeveloper implements Employee{

    public int salary(){
        System.out.println("Web developer salary is: ");
        return 60000;
    }

    public String name(){
        System.out.println("I am a web developer");
        return "Smith";
    }
}
