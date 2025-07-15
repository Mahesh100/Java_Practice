package Practice.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String [] args){
        List<String> languageList = Arrays.asList("Java","Angular","Spring","Node");

        List<Integer> result = languageList.stream().
                map(str->str.length()).collect(Collectors.toList());

        System.out.println(languageList);
        System.out.println(result);
    }
}
