package CodingQuestions.Programs.Strings;

import java.util.*;


public class LengthOfStringInCollection {

    public static void main(String[] args) {

        List<String> str = Arrays.asList("bus","car","Airplane");

        //before java 8

        //using advanced for loop

        for(String result: str){
            System.out.println(result.length());
        }
    }
}
