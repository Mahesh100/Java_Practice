package CodingQuestions.StreamAPI.All_StreamAPI_Questions.StreamAPI.mostAsked_20;
//Find first element of list

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetFirstThreeElements {

    public static void main(String [] args) {
        List<Integer> numbersList = Arrays.asList(1, 2, 4, 5);
        List<Integer> resultList = numbersList.stream().limit(3).collect(Collectors.toList());
        System.out.println(resultList);
    }

}
