package FunctionalProgramming.LambadaExpression.PredefineLambada;

import java.util.ArrayList;

public class EmployeeDemo {

    public static void main(String[] args) {

        Employee emp = new Employee("John", 50000, 5);

        //write a lambada expression which will return the name of the employee
        // having salary is > 30k and experience > 3 years

        Predicate<Employee> pr =e-> (e.Salary>=30000 && e.experience>=3);

        boolean result = pr.test(emp);

        System.out.println(result);

        //Example 2

        //Requirement is store multiple employee objects to arraylist and
        // check the condition using lambada expression

        ArrayList<Employee> al = new ArrayList<Employee>();

        al.add(new Employee("John", 50000, 3));
        al.add(new Employee("David", 20000, 2));
        al.add(new Employee("Scot", 40000,6));

        for(Employee e:al)
        {
            if(pr.test(e))
            {
                System.out.println(e.name +"  "+e.Salary);
            }
        }

    }
}
