package Programs.StreamAPI;

// Find sum of all elements in a list using Stream API

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SumOfIntegers {
    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int  elementSum = numList.stream().mapToInt(Integer::intValue).sum();
        System.out.println(elementSum);
    }
}
