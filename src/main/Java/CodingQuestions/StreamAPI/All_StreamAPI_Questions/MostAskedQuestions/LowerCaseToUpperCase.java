package CodingQuestions.StreamAPI.All_StreamAPI_Questions.MostAskedQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LowerCaseToUpperCase {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("Apple","Banana","Mango","Cherry");

        List<String> resultUpperCase = words.stream().map(a->a.toUpperCase()).collect(Collectors.toList());

        //Without using lambda expression
        List<String> resultLowerCase = words.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println("List with lower case: "+resultLowerCase);

        //System.out.println(resultUpperCase);
        for(String result:resultUpperCase){
            System.out.println(result);
        }
    }
}
