package CodingQuestions.StreamAPI.All_StreamAPI_Questions.MostAskedQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestElement {
    public static void main(String [] args){
        List<Integer> numbers = Arrays.asList(1,8,2,4,5,3,7);

        Integer secondHighest = numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

        System.out.println("Second Highest Element in an array is:"+secondHighest);
    }
}
