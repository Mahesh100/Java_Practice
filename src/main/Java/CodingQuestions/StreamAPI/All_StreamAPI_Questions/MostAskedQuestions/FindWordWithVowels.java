package CodingQuestions.StreamAPI.All_StreamAPI_Questions.MostAskedQuestions;

/*
* Given a sentence find the word having specified number of vowels
*
* Number of vowels : 2
* */

import java.util.Arrays;

public class FindWordWithVowels {

    public static void main(String [] args) {
        String s = "I am learning Java Using Streams API";

        Arrays.stream(s.split(" ")).filter(x->x.replaceAll("[^aeiouAEIOU]","").length()==2).
                forEach(System.out::println);
    }
}
