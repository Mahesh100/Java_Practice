package CodingQuestions.StreamAPI.All_StreamAPI_Questions.MostAskedQuestions.StreamAPI.FilterMethod;


import java.util.ArrayList;
import  java.util.List;
import  java.util.Arrays;
import java.util.stream.Collectors;

public class FilterDemo2 {
    public static void main(String[] args) {

       // Write a java program to names having length of name should be greater than 6 and less than 8

        List<String> employeeName = Arrays.asList("Maheshka","Renuka","Tim","Shweta", "Rekha");

        List <String> filterEmp = new ArrayList<>();


     filterEmp = employeeName.stream().filter(n->n.length()>6 && n.length()<=8).collect(Collectors.toList());

        System.out.println(filterEmp);

    }
}
