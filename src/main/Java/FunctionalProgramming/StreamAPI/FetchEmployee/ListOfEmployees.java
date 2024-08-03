package FunctionalProgramming.StreamAPI.FetchEmployee;

import java.util.*;
import java.util.stream.Collectors;

public class ListOfEmployees {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(101, "Alex",20000));
        employeeList.add(new Employee(101, "Alex",50000));
        employeeList.add(new Employee(102,"John",60000));
        employeeList.add(new Employee(103,"Kiran", 70000));

       /*List<Employee> employeesList-new ArrayList<Employee>();
employeesList.add(new Employee (101, "Alex",10000));
employeesList.add(new Employee (101, "Alex",10000));
employeesList.add(new Employee (101, "Alex",10000));
employeesList.add(new Employee (101, "Alex",10000));*/
//        List<Employee> employeesList= Arrays.asList(
//                new Employee (101, "Alex",10000),
//                new Employee (102, "Brian", 20000),
//                new Employee (103, "Charles", 30000),
//                new Employee (104, "David", 40000),
//                new Employee (105, "Edward", 50000)
//        );

        List<Integer> resultList = employeeList.stream().filter(e->e.salary>50000).map(e->e.salary).collect(Collectors.toList());
        System.out.println(resultList);

//        List<Integer> employeeSalList=employeesList.stream()
//                .filter(e->e.salary<20000) // filtering
//                .map(e->e.salary)
//                .collect (Collectors.toList());
//
//        System.out.println(employeeSalList);


    }
}
