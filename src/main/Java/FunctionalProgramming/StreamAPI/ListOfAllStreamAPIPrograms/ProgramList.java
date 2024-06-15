package FunctionalProgramming.StreamAPI.ListOfAllStreamAPIPrograms;

import FunctionalProgramming.StreamAPI.durgesh.StreamObject;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ProgramList {

    public static void main(String[] args) {

/*
    1]  Create list and filer all the even numbers from the list   */

        List<Integer> list = Arrays.asList(5,4,3,2,1);

        //Even Numbers List
        List<Integer> evenlist = list.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println("Even Number list is :"+evenlist);

        //Odd Number list
        List<Integer> oddList = list.stream().filter(i->i%2!=0).collect(Collectors.toList());
        System.out.println("Odd Numbers list is :"+ oddList);


        //Sort the list
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted List is :"+sortedList);


/*  2] Program to find name from the list which starts with "A" letter  */

        List<String> names = Arrays.asList("Aniket","Vedant", "Akash", "Mahesh", "Amay");

        List<String> namesWithA = names.stream().filter(i->i.startsWith("A")).collect(Collectors.toList());
        //List<String> namesWithA = names.stream().filter(i->i.startsWith("e",1)).collect(Collectors.toList());
        System.out.println("Names which are starts with A are : "+ namesWithA);



/*  3]  Program to square each element in list and return the list                               */

        List<Integer> list2 = List.of(1,2,3,4,5);

        List<Integer> squareList = list2.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println("List having square of each element in list is: "+squareList);


/*  4] Find sum of all the elements in a List using Stream API   */

        List<Integer> list3 = List.of(1,2,3,4,5,6,7,8,9,10);

        // Using method reference
        int sum = list3.stream().mapToInt(Integer::intValue).sum();     //


        System.out.println("Sum of all integer elements in List is : "+ sum);

        // More optimize using method reference

        Optional<Integer> reduceSumWithMethodReference =list3.stream().reduce(Integer::sum);

        System.out.println(reduceSumWithMethodReference.get());

        // Using reduce method

        Optional<Integer> sumResult = list3.stream().reduce((a,b)->a+b);

        System.out.println(sumResult.get());

        //Multiplication of numbers

        Integer multiResult = list3.stream().reduce(1,(a,b)->a*b);
        System.out.println("Multiplication is: "+multiResult);


        //Max values from  stream

           Integer maxValue= list3.stream().reduce(0,(a,b)->a>b?a:b);
        System.out.println("Max value is: "+maxValue);

        //Max value using method reference

        Integer maxValueMethodReference = list3.stream().reduce(Integer::max).get();
        System.out.println("Max value using method reference is "+maxValueMethodReference);


/*  5] Program to find average of all numbers in list  */

      //  List<Integer> list3 = List.of(1,2,3,4,5,6,7,8,9,10);

        OptionalDouble averageOfNumbers1= list3.stream().mapToInt(Integer::intValue).average();
        System.out.println("Average of numbers is: "+averageOfNumbers1.getAsDouble());

        //Using simple mapToint()

        double averageOfNumbers2 = list3.stream().mapToInt(e->e).average().getAsDouble();
        System.out.println("Average of Number is: " +averageOfNumbers2);


/*  6] Find the square of each number in list and then filter the list having number greater than 25 and then find the average of number  */

        //  List<Integer> list3 = List.of(1,2,3,4,5,6,7,8,9,10);

        List<Integer> square = list3.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(square);
        List<Integer> greaterNumber =  square.stream().filter(i->i>40).collect(Collectors.toList());
        System.out.println(greaterNumber);
        double averageOfNumber = greaterNumber.stream().mapToInt(e->e).average().getAsDouble();
        System.out.println("Average of Number is :"+averageOfNumber);

        //simple approch

      double avg =  list3.stream()
                .map(e->e*e)                                       //square of number
                    .filter(e->e>40)                               // Filter the number according to condition
                        .mapToInt(e->e).                           //Find the average of number
                                average().getAsDouble();

        System.out.println("Average of number is using 2nd approach: "+avg);


/*  Find the number whose prefix starts with 2 */

        List<Integer> list4 = Arrays.asList(23,11,24,224,55,-2,100);

       List<Integer> preList =  list4.stream().filter(i->i.toString().startsWith("2")).collect(Collectors.toList());
        System.out.println("The numbers which are starts with 2 are: "+preList);

        //Using map() method

        List<Integer> preList2 = list4.stream().map(e->String.valueOf(e)).filter(e->e.startsWith("2")).map(Integer::valueOf).collect(Collectors.toList());
        System.out.println("The numbers which are starts with 2 are: "+preList2);


/* ] Find the longest string from list of strings using stream api */

        List<String> words = Arrays.asList("Core java", "SpringBoot","Hibernate");

        String longestString = words.stream().reduce((word1, word2)->word1.length()>word2.length()?word1:word2).get();
        System.out.println("Longest string is: "+longestString);












    }
}
