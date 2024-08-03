package Programs.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LowerCaseToUpperCase {

    public static void main(String[] args) {

        List<String> str = Arrays.asList("gfg","abcd", "defg");

        List<String> resultList = str.stream().map(a->a.toUpperCase()).collect(Collectors.toList());

        for(String result:resultList){
            System.out.println(result);
        }
    }
}
