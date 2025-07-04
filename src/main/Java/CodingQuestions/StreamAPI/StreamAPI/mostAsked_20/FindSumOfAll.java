package CodingQuestions.StreamAPI.StreamAPI.mostAsked_20;
//Find sum of all numbers in list

import java.util.Arrays;
import java.util.List;

public class FindSumOfAll {
    public static void main(String [] args){
        List<Integer> numbersList = Arrays.asList(1,2,3);

        int sumOfNumbers = numbersList.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sumOfNumbers);
    }
}
