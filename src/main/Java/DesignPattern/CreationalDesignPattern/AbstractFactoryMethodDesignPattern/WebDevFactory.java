package DesignPattern.CreationalDesignPattern.AbstractFactoryMethodDesignPattern;

public class WebDevFactory extends EmployeeAbstractFactory{

    public  Employee createEmployee(){
        return new WebDeveloper();
    }
}
