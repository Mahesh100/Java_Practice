package CodingQuestions.StreamAPI.All_StreamAPI_Questions.StreamAPI.mostAsked_20;
//Check if all numbers are even

import java.util.Arrays;
import java.util.List;

public class CheckIfAllNumbersEven {
    public static void main(String [] args){
        List<Integer> numberlist = Arrays.asList(1,2,4,5);

        boolean check = numberlist.stream().allMatch(n->n%2==0);
        System.out.println(check);
    }
}
