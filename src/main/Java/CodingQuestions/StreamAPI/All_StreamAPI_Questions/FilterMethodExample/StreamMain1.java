package CodingQuestions.StreamAPI.All_StreamAPI_Questions.FilterMethodExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {

    public static void main(String[] args) {

        //Create a list and filter all even number from list

        List<Integer> list1 = List.of(2,4,50,21,22,67);


        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(74);
        list2.add(23);
        list2.add(78);

        List<Integer> list3 = Arrays.asList(2,4,50,21,22,67);


        //list1  without stream

        List<Integer> listEven = new ArrayList<>();

        for(Integer i:list1)
        {
            if(i%2==0){
                listEven.add(i);
            }
        }

        System.out.println(list1);
        System.out.println(listEven);


        //Using Stream API filter all even number from the list

          Stream<Integer> streamOfIntegers = list1.stream();

        List<Integer> result = streamOfIntegers.filter(i->i%2!=0).collect(Collectors.toList());

        System.out.println(result);



    }
}
