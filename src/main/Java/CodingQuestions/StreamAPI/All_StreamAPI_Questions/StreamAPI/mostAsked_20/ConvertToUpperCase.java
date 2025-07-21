package CodingQuestions.StreamAPI.All_StreamAPI_Questions.StreamAPI.mostAsked_20;

//Convert the list of String to upper case

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class ConvertToUpperCase {
    public static void main(String [] args){
        List<String> stringList = Arrays.asList("banana","mango","apple");

        List<String> resultList = stringList.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
        System.out.println(resultList);

        // Second  approach

        List<String> resultList2 = stringList.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(resultList2);

    }
}
