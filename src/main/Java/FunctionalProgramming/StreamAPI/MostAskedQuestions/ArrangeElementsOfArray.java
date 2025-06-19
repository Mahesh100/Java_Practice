package FunctionalProgramming.StreamAPI.MostAskedQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/*
* Given an array of integers rearrange the elements to form highest to lowest possible value
*
* */
public class ArrangeElementsOfArray {
    public static void main(String [] args){

        int[] arr = {5,4,3,2,1};

        //For lowest to highest
        Arrays.stream(arr).mapToObj(x->x).sorted().forEach(System.out::print);
        System.out.println();
        //For Highest to lowest
        Arrays.stream(arr).mapToObj(x->x).sorted(Collections.reverseOrder()).forEach(x->System.out.print(x+","));
    }
}
