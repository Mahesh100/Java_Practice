package CodingQuestions.StreamAPI.All_StreamAPI_Questions.MostAskedQuestions;

import javax.sound.midi.SysexMessage;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.StreamSupport.stream;

public class FindOccurrenceOfWord {

    public static void main(String [] args){
        String s = "I am learning stream API in java java";

        Map<String,Long> ans = Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(ans);
    }



}
