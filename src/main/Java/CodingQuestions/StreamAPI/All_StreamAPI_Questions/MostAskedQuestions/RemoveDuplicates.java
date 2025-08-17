package CodingQuestions.StreamAPI.All_StreamAPI_Questions.MostAskedQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String [] args){

        List<Integer> list = Arrays.asList(1,2,3,4,4);

        List<Integer> withoutDuplicates = list.stream().distinct().collect(Collectors.toList());
        System.out.println(withoutDuplicates);

        //Without using distinct method
        HashSet<Integer> seen = new HashSet<>();

        List<Integer> withoutDuplicates2 = list.stream().filter(n->seen.add(n)).collect(Collectors.toList());
        System.out.println(withoutDuplicates2);

        withoutDuplicates2.forEach(System.out::println);
    }
}
