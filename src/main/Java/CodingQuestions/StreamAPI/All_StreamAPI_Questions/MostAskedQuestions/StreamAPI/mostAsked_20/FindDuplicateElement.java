package CodingQuestions.StreamAPI.All_StreamAPI_Questions.MostAskedQuestions.StreamAPI.mostAsked_20;
//Find the duplicate element in list using stream api

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElement {
    public static void main(String [] args){
        List<Integer> numbersList = Arrays.asList(1,2,3,4,4);

        Set<Integer> seen = new HashSet<>();

        List<Integer> duplicates = numbersList.stream().filter(n->!seen.add(n)).collect(Collectors.toList());
        System.out.println(duplicates);
    }
}
