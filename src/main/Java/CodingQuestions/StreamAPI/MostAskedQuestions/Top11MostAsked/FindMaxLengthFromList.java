package CodingQuestions.StreamAPI.MostAskedQuestions.Top11MostAsked;
import java.util.Arrays;
import java.util.List;

public class FindMaxLengthFromList {
    public static void main(String [] args){

        List<String > words = Arrays.asList("corejava","spring","Hibernate");

        String longestString = words.stream().reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
        System.out.println(longestString);
    }
}
