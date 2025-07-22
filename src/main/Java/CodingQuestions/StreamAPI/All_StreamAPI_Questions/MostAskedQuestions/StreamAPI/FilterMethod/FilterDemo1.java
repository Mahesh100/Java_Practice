package CodingQuestions.StreamAPI.All_StreamAPI_Questions.MostAskedQuestions.StreamAPI.FilterMethod;

import java.util.Arrays;
import java.util.List;

public class FilterDemo1 {

    public static void main(String[] args) {


        List<Integer> numbersList = Arrays.asList(10,20,15,30,35);

    ///    List<Integer> evenNumbersList = numbersList.stream().filter(i->i%2==0).collect(Collectors.toList());

     //   System.out.println(evenNumbersList);

       numbersList.stream().filter(n->n%2==0).forEach(n-> System.out.println(n));

      //  System.out.println(evenNumbersList);
    }

//    public static List<Integer> filterData()
//    {
//
//        return null;
//    }
}
