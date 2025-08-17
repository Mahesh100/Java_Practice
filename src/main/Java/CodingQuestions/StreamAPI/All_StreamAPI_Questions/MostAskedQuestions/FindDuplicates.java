package CodingQuestions.StreamAPI.All_StreamAPI_Questions.MostAskedQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String [] args){

        List<Integer> list = Arrays.asList(1,2,3,2,4,5);

        HashSet<Integer> seen = new HashSet<>();

        List<Integer> duplicates = list.stream().filter(n->!seen.add(n)).collect(Collectors.toList());

        System.out.println("Duplicate elements from the list are: "+duplicates);

        //For printing individual element from list
        duplicates.forEach(System.out::print);
    }
}
