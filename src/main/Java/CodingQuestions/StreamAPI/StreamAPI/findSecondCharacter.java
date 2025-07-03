package CodingQuestions.StreamAPI.StreamAPI;


import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


//Fetch 2nd character from the string


public class findSecondCharacter {

    public static void main(String[] args) {

        List<String> strList = Arrays.asList("Geeks", "For", "Geeks", "Mahesh");

        List<Character> resultList = strList.stream().flatMap(str-> Stream.of(str.charAt(2))).collect(Collectors.toList());
        System.out.println(resultList);

        for(Character result :resultList){
            System.out.print(result+" ");
        }

        List <Stream<Character>> resultList2 = strList.stream().map(a->Stream.of(a.charAt(2))).collect(Collectors.toList());

        System.out.println("Second Output"+resultList2.toString());

        for(Stream<Character> result2:resultList2){

           // System.out.println(result2.toString());

            result2.forEach(System.out::print);
            System.out.print(" - ");
        }
    }
}
