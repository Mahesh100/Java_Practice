package DesignPattern.AbstractFactoryMethodDesignPattern;

public class Client {

    public static void main(String [] args){
        //get android developer

        Employee e1=EmployeeFactory.getEmployee(new AndroidDevFactory());
        e1.name();
        e1.salary();

        //get web developer

        Employee e2 = EmployeeFactory.getEmployee(new WebDevFactory());
        e2.name();
        e2.salary();
    }
}
