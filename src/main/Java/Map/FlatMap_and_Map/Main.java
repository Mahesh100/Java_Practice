package Map.FlatMap_and_Map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class Main {
    public static void main(String[] args) {

        List<String> citiesWorkedIn1 = new ArrayList<String>();
        citiesWorkedIn1.add("Pune");
        citiesWorkedIn1.add("Mumbai");
        citiesWorkedIn1.add("Noida");
        citiesWorkedIn1.add("Bangalore");

        Employee e1 = new Employee(1, "Code", citiesWorkedIn1);

        List<String> citiesWorkedIn2 = new ArrayList<String>();
        citiesWorkedIn2.add("Pune");
        citiesWorkedIn2.add("Mumbai");
        citiesWorkedIn2.add("Noida");
        citiesWorkedIn2.add("Bangalore");

        Employee e2 = new Employee(2, "Code2", citiesWorkedIn2);

        List<String> citiesWorkedIn3 = new ArrayList<String>();
        citiesWorkedIn3.add("Pune");
        citiesWorkedIn3.add("Mumbai");
        citiesWorkedIn3.add("Banglore");
        citiesWorkedIn3.add("Noida");

        Employee e3 = new Employee(3, "code3", citiesWorkedIn3);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

        System.out.println(employeeList);

        //Now if we want to find out list of all the Id's of all the Employees in company

//        List<Integer> ids = new ArrayList<Integer>();
//
//        for(Employee employee:employeeList){
//            ids.add(employee.getId());
//        }
//
//        System.out.println(ids);

        //So instead of using for loop and iterating through all the Id's we can just use Map here

        List<Integer> ids = new ArrayList<Integer>();

        employeeList.stream().map(emp ->emp.getId()).collect(Collectors.toList());

        System.out.println(ids);

    }
}
