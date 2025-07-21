package CodingQuestions.StreamAPI.All_StreamAPI_Questions.MostAskedQuestions.MostAskedStreamAPI_GroupBy;
//Find the average of given list using java 8 Stream API

import java.util.Arrays;
import java.util.List;

public class FindAverageOfList {
    public static void main(String [] args){
        List<Integer> numbers = Arrays.asList(10,20,30,40,50);

        double average = numbers.stream()    //convert the list into stream
                .mapToInt(num->num.intValue())   //Convert the Integer into int
                .average()   //calculate the average
                .getAsDouble();

        System.out.println(average);
    }
}
