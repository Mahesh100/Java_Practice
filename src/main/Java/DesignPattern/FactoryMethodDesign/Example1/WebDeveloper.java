package DesignPattern.FactoryMethodDesign.Example1;

public class WebDeveloper implements Employee{

    public int salary(){
        System.out.println("Getting web developer salary");
        return 40000;
    }
}
