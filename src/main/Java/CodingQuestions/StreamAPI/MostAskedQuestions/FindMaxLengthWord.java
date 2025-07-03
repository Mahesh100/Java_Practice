package CodingQuestions.StreamAPI.MostAskedQuestions;

import java.util.Arrays;
import java.util.Comparator;

/*
* Given a sentence find the word that has highest length
*
* Sentence: "I am learning stream api in java"
* */

public class FindMaxLengthWord {

    public static void main(String[] args) {
        String sentence = "I am learning stream api in java";
        String string = "I am a String";

        String longestWord = Arrays.stream(sentence.split(" "))
                .max(Comparator.comparing(String::length))
                .orElse(""); // safer than .get() in case of empty input

        System.out.println("Longest word: " + longestWord);

        String longestWord2 = Arrays.stream(string.split(" ")).max(Comparator.comparing(String::length)).orElse("");

    }
}

