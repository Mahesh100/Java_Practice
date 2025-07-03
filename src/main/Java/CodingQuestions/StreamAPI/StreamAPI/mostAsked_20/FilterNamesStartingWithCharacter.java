package CodingQuestions.StreamAPI.StreamAPI.mostAsked_20;
// Filter the names starting with character A  or specific character

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FilterNamesStartingWithCharacter {

    public static void main(String [] args) {
        List<String> strigList = Arrays.asList("Apple", "Banana", "Mango");

        List<String> resultList = strigList.stream().filter(n -> n.startsWith("A")).collect(Collectors.toList());
        System.out.println(resultList);

    }
}
