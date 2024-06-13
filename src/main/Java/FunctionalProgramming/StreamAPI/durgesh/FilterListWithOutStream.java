package FunctionalProgramming.StreamAPI.durgesh;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterListWithOutStream {

    public static void main(String[] args) {

        // Create a list and filter the all even numbers from the list

        List<Integer> evenList = Arrays.asList(1,3,4,5,2,6);

        for (Integer result:evenList){
            if (result%2==0){
                System.out.println(result);
            }
        }

        //Using stream api

        List<Integer> resultList = evenList.stream().filter(i->i%2==0).collect(Collectors.toList());

        for (Integer finalList:resultList){
            System.out.println(finalList);
        }
    }
}
