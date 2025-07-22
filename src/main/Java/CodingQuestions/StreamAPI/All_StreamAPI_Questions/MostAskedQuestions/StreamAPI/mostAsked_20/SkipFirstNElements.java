package CodingQuestions.StreamAPI.All_StreamAPI_Questions.MostAskedQuestions.StreamAPI.mostAsked_20;
//Skip first 3 elements from list

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipFirstNElements {
    public static void main(String [] args){
        List<Integer> numbersList = Arrays.asList(1,2,3,4,5);

        List<Integer> resultList = numbersList.stream().skip(3).collect(Collectors.toList());
        System.out.println(resultList);
    }
}
