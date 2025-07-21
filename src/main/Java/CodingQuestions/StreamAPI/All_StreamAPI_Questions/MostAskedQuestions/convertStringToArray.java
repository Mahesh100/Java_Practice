package CodingQuestions.StreamAPI.All_StreamAPI_Questions.MostAskedQuestions;

import java.util.Arrays;

public class convertStringToArray {

    public static void main(String [] args){
        String sentence = "This is sentence";

        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
    }
}
