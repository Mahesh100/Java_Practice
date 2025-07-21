package CodingQuestions.StreamAPI.All_StreamAPI_Questions.MostAskedQuestions;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
* Given a character find the occurrence of each character.
*
* */

public class FindOccurrenceOfCharacter {

    public static void main(String [] args){
        String s = "Mississippi";

       Map<String,Long> ans = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

       System.out.println(ans);
    }
}
