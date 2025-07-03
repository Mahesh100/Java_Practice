package CodingQuestions.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterDemo2 {

    public static void main(String[] args) {
        //print the names in list which are having length >6 and less than 8 length<8

        List<String> namesList = Arrays.asList("Mahesh", "Johan", "Scot", "Marry");

        List<String> resutlantList = new ArrayList<String>();

        namesList.stream().filter(n->(n.length()>=6 && n.length()<8)).forEach(n-> System.out.println(n));

        resutlantList = namesList.stream().filter(n->n.length()>=6 && n.length()<8).collect(Collectors.toList());
        System.out.println(resutlantList);
    }
}
