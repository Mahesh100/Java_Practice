package CodingQuestions.StreamAPI.All_StreamAPI_Questions.MostAskedQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindOccurrenceWord {
    public static void main(String [] args){

        List<String> words = Arrays.asList("Apple","Mango","Banana","Apple","Guava");

        Map<String,Long> countMap = words.stream().collect(Collectors.groupingBy(w->w,Collectors.counting()));

        System.out.println(countMap);
    }
}
