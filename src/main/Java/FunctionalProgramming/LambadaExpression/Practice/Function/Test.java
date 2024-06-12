package FunctionalProgramming.LambadaExpression.Practice.Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


class Employee{
    String ename;
    int salary;

    Employee(String ename, int salry){
        this.ename = ename;
        this.salary =salry;

    }
}


public class Test {

    public static void main(String[] args) {

        Function<Integer, Integer> f = n->n*n;

        System.out.println(f.apply(10));



        // Find the string length

        Function<String, Integer> strf = n->n.length();

        System.out.println(strf.apply("Mahesh"));


        //Example 3
        //

        List<Employee> empList = new ArrayList<Employee>();

        empList.add(new Employee("David",50000));
        empList.add(new Employee("John",30000));
        empList.add(new Employee("Mary",20000));


        Function<Employee,Integer> FN =e->{

            int sal = e.salary;
            if(sal>= 10000&& sal<=20000){
                return sal*10/100;
            } else if (sal>20000 && sal<30000) {
                return sal*20/100;
            }else if (sal>30000 && sal<50000)
                return sal*30/100;
            else
                return (sal*40/100);
        };
        Predicate<Integer> pr = b->b>5000;

        for (Employee emp:empList){
           int bonus = FN.apply(emp);
               if( pr.test(bonus)) {
                   System.out.println(emp.ename + "  " + emp.salary);
                   System.out.println("Bonus is:" + bonus);
               }
        }


    }

}
