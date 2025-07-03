package CodingQuestions.StreamAPI.StreamAPI.StreamAPI.FilterMethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class EmployeeC {
    int id;
    String name;

    EmployeeC(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "EmployeeC{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}

// Filter the list of Employees having evenId
public class EvenIdEmployee {

    public static void main(String[] args) {

        List<EmployeeC> empList = Arrays.asList(new EmployeeC(1, "abc"), new EmployeeC(2, "def"));

        List<EmployeeC> evenEmpList = empList.stream()
                .filter(emp -> emp.id % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenEmpList);
    }
}
