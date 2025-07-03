package CodingQuestions.StreamAPI.StreamAPI.mostAsked_20;

//Count even numbers in list

import java.util.List;
import java.util.Arrays;

public class CountEvenNumbers {
    public static void main(String [] args){
        List<Integer> numbersList = Arrays.asList(1,2,3,4);

        long countEvenNumbers = numbersList.stream().filter(n->n%2==0).count();
        System.out.println(countEvenNumbers);

    }
}
