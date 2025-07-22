package CodingQuestions.StreamAPI.All_StreamAPI_Questions.FilterMethodExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterListWithOutStream {

    public static void main(String[] args) {

        // Create a list and filter the all even numbers from the list and add them in another list of integer

        List<Integer> evenList = Arrays.asList(1,3,4,5,2,6);

        for (Integer result:evenList){
            if (result%2==0){
                System.out.println(result);
            }
        }

        //Second list

        List<Integer> list2 = Arrays.asList(3,4,6,8,9,10);
        //convert into mutable list
        List<Integer> mlsit2 = new ArrayList<>(Arrays.asList(3,4,6,8,9,10));

        mlsit2.addAll(list2);
        System.out.println(mlsit2);


        // Another way using Unmodifiable list

        List<Integer> inList = List.of(1,3,4,5,2,6);

        //Find the element which is greater than 4

        for(Integer greaterElement: evenList){
            if(greaterElement>4){
                System.out.println("Element greater than 4 is "+greaterElement);
            }
        }
//--------------------------------------------------------------------------------------------------------------------------------------------

        //Using stream api

        List<Integer> resultList = evenList.stream().filter(i->i%2==0).collect(Collectors.toList());

        for (Integer finalList:resultList){
            System.out.println(finalList);
        }

        mlsit2.addAll(resultList);
        System.out.println("Stream output is: "+ mlsit2);


        //Find the elements greater than 4

        List<Integer> greaterThan4 = evenList.stream().filter(i->i>4).collect(Collectors.toList());
        System.out.println("Using stream "+greaterThan4);




    }
}
