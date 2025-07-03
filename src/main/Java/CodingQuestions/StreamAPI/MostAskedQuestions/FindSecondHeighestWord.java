package CodingQuestions.StreamAPI.MostAskedQuestions;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondHeighestWord {

    public static void main(String [] args){
        String s = "I am learning stream api in java"; // output : stream

        String secondHeighest = Arrays.stream(s.split(" ")).sorted(Comparator.comparing(String::length).reversed())
                        .skip(1).findFirst().get();

        System.out.println(secondHeighest);
    }
}
