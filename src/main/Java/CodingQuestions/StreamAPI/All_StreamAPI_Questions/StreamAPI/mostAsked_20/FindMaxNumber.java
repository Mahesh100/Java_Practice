package CodingQuestions.StreamAPI.All_StreamAPI_Questions.StreamAPI.mostAsked_20;

import java.util.Comparator;
import java.util.List;
import java.util.Arrays;

public class FindMaxNumber {
    public static  void  main(String [] args){
        List<Integer> numbersList = Arrays.asList(1,2,3,4);
        int result = numbersList.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(result);
    }
}
