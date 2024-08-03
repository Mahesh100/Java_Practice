package Programs.StreamAPI;


import java.util.*;
import java.util.stream.Collectors;

// map the string length instead of string
public class MapLengthOfString {

    public static void main(String[] args) {

        List<String> str = Arrays.asList("abcd", "efg");

        List<Integer> resultList = str.stream().map(i->i.length()).collect(Collectors.toList());

        for(Integer result : resultList){
            System.out.println(result);
        }

    }
}
