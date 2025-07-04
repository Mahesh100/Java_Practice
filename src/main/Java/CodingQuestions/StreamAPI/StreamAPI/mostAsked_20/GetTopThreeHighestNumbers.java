package CodingQuestions.StreamAPI.StreamAPI.mostAsked_20;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GetTopThreeHighestNumbers {
    public static void main(String [] args){
        List<Integer> numbersList = Arrays.asList(1,2,3,4);

        List<Integer> topThreeNumbers = numbersList.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
        System.out.println(topThreeNumbers);
    }
}
