package CodingQuestions.StreamAPI.StreamAPI.mostAsked_20;
//Find minimum number from the list

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class findMinimumNumber {
    public static void main(String [] args){

        List<Integer> numbersList = Arrays.asList(1,2,3,4);
        int minNumber = numbersList.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(minNumber);
    }
}
