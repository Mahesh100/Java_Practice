package FunctionalProgramming.StreamAPI.MostAskedQuestions;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondHighestLength {

    public  static void main(String [] args){
        String s = "I am learning stream api";   //Output : stream = 6

        int secondHighestLength = Arrays.stream(s.split(" ")).map(x->x.length()).sorted(Comparator.reverseOrder()).skip(1)
                .findFirst().get();

        System.out.println(secondHighestLength);
    }
}
