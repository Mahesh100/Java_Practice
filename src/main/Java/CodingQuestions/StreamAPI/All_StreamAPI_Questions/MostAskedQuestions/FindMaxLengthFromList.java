package CodingQuestions.StreamAPI.All_StreamAPI_Questions.MostAskedQuestions;
import java.util.Arrays;
import java.util.List;

public class FindMaxLengthFromList {
    public static void main(String [] args){

        List<String > words = Arrays.asList("corejava","spring","Hibernate");

        String longestString = words.stream().reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
        System.out.println(longestString);
    }
}
