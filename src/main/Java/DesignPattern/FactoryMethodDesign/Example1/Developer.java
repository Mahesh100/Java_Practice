package DesignPattern.FactoryMethodDesign.Example1;

public class Developer {
    public static void main(String[] args) {

            Employee employee = EmployeeFactory.getEmployee("android developer");
        System.out.println(employee.salary());

      Employee employee1=  EmployeeFactory.getEmployee("web developer");
        System.out.println(employee1.salary());
    }
}
