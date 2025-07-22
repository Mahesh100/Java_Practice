package CodingQuestions.StreamAPI.All_StreamAPI_Questions.MostAskedQuestions.StreamAPI.mostAsked_20;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetEvenNumbers {
    public static void main(String [] args){
        List<Integer> numbersList = Arrays.asList(1,2,3,4,5,6);

        List<Integer> everNumbersList = numbersList.stream().filter(n->n%2==0).collect(Collectors.toList());

        System.out.println(everNumbersList);
    }
}
