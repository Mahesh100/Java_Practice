package CodingQuestions.StreamAPI.MostAskedQuestions.MostAskedStreamAPI_GroupBy;

//Group the employees by age by using java 8 Streams

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
    private int id;
    private String name;
    private int age;

    public Employee(int id, String name, int age){
        this.id =id;
        this.name=name;
        this.age =age;
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age =age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class GroupEmployeesByAge {
    public static void main(String [] args){
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Mahesh", 29),
                new Employee(2 ,"Ramesh", 30),
                new Employee (3, "Johan", 28),
                new Employee (4,"Deepak", 29),
                new Employee(5, "Sanjay",30)
        );

        // Group the employees by age
        Map<Integer,List<Employee>> map = employees.stream().collect(Collectors.groupingBy(employee->employee.getAge()));

        map.forEach((key,value)->{
            System.out.println("Age: " +key);
            System.out.println("List of employees: "+ value);
        });


    }
}
