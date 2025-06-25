package DesignPattern.CreationalDesignPattern.AbstractFactoryMethodDesignPattern;

public class EmployeeFactory {

    // get the employee

    public static  Employee getEmployee(EmployeeAbstractFactory factory){
            return factory.createEmployee();
    }


}
