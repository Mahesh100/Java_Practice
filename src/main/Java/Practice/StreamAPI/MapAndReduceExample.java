package Practice.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Get sum of all the elements in list

public class MapAndReduceExample {
    public static void main(String [] args){
        List<Integer> numbers = Arrays.asList(3,7,8,1,5,9);

        //Using mapToInt
        int sum1 =  numbers.stream().mapToInt(i->i).sum();
        System.out.println(sum1);

        //Using reduce() method & lambada
        Integer reduceSum = numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println(reduceSum);

        //Using reduce method & method reference
        Optional<Integer> reduceSum2 = numbers.stream().reduce(Integer::sum);
        System.out.println(reduceSum2.get());

        //Perform the multiplication of numbers
        Integer productOfNumbers = numbers.stream().reduce(1,(a,b)->a*b);
        System.out.println(productOfNumbers);


//        int sum=0;
//        for(int no: numbers){
//            sum = sum+no;
//        }
//
//        System.out.println(sum);
    }
}
