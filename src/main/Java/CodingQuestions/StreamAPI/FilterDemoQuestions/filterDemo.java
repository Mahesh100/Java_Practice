package CodingQuestions.StreamAPI.FilterDemoQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterDemo {

    public static void main(String [] args) {

//        ArrayList<Integer> NumberList = new ArrayList<Integer>();
//
//        NumberList.add(10);
//        NumberList.add(15);
//        NumberList.add(25);
//        NumberList.add(30);

        List <Integer>numbersList =Arrays.asList(10,15,20,25,30);

        List<Integer> evenNumberList = new ArrayList<Integer>();

        //without using stream api
        for(int n:numbersList)
        {
            if(n%2==0)
            {
                evenNumberList.add(n);
            }
        }
       // System.out.println(evenNumberList);

        //with using stream API

        evenNumberList = numbersList.stream().filter(n->n%2==0).collect(Collectors.toList());

        System.out.println(evenNumberList);

        // other method to directly print the values

        numbersList.stream().filter(n->n%2==0).forEach(n-> System.out.println(n));

    }
}
