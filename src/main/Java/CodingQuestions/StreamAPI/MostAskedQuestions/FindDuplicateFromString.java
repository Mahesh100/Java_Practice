package CodingQuestions.StreamAPI.MostAskedQuestions;

import java.util.Arrays;

/*
* Given a string find the duplicate from a string and return in same order
*
* */
public class FindDuplicateFromString {

    public static void  main(String [] args){
        String s = "dabcadefg";   //output : dabcefg

        //First way
        s.chars().distinct().mapToObj(x->(char)x).forEach(System.out::print);   //Using intStream and s.chars() method

        //Second way (Easier)
        Arrays.stream(s.split("")).distinct().forEach(System.out::print);

    }
}
