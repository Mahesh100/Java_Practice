package CodingQuestions.StreamAPI;

import Map.FlatMap_and_Map.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {

    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(new Employee(1, "abc"), new Employee(2, "abc"), new Employee(3, "abc"), new Employee(4, "abc"));

        // FilterMethod even IDs using Stream API
        List<Integer> empIdList = empList.stream()
                .map(Employee::getId)
                .filter(id -> id % 2 == 0)
                .collect(Collectors.toList());

        // Print the list of even employee IDs
        System.out.println("Even Employee IDs: " + empIdList);
    }
}
