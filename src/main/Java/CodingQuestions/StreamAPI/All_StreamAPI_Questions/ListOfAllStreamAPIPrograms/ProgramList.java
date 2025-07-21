package CodingQuestions.StreamAPI.All_StreamAPI_Questions.ListOfAllStreamAPIPrograms;

import java.util.*;
import java.util.stream.Collectors;

/*  List of Questions below :
*
*   1)  Filter all even numbers from list
*   2)  Filter all odd numbers from list
*   3)  Sort the list in ascending order
*   4)  Sort the list in descending order
*   5)  Square each element in list and return the list
*   6)  Find sum of all element in list
*   7)  Find product of numbers in list
*   8)  Max and minimum element from the list
*   9)  Find the average of all numbers in list
*   10) Find the square of each number in list and then filter the list having number greater than 25 and then find the average of number
*   11) Find the number from list whose prefix starts with 2
*   12) Find the duplicate element from the list
*   13) Find the Limit numbers from list (First 5 numbers ) and then find the sum of first 5 numbers
*   14) Find second highest and second-lowest number from list
* //String->
*   15) Find the word from list of words which starts with 'A'
*   16) Find the longest string from list of strings using stream api */

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


        //Sort the list ascending order
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted List is : "+sortedList);

        //Sort list using  descending order
        List<Integer> sortedDecendingList2 = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println("Sorted list is: "+sortedDecendingList2);

        System.out.println();
/*  2] Program to find name from the list which starts with "A" letter  */

        List<String> names = Arrays.asList("Aniket","Vedant", "Akash", "Mahesh", "Amay");

        List<String> namesWithA = names.stream().filter(i->i.startsWith("A")).collect(Collectors.toList());
        //List<String> namesWithA = names.stream().filter(i->i.startsWith("e",1)).collect(Collectors.toList());
        System.out.println("Names which are starts with A are : "+ namesWithA);



/*  3]  Program to square each element in list and return the list                               */

        List<Integer> list2 = List.of(1,2,3,4,5);

        List<Integer> squareList = list2.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println("List having square of each element in list is: "+squareList);

        System.out.println();
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

        // Max and Min value(element) using comparator

        int max = list3.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Max element is :"+max);

        int min = list3.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Minimum element is: "+min);


        System.out.println();
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


/*  7] Find the number whose prefix starts with 2 */

        List<Integer> list4 = Arrays.asList(23,11,24,224,55,-2,100);

       List<Integer> preList =  list4.stream().filter(i->i.toString().startsWith("2")).collect(Collectors.toList());
        System.out.println("The numbers which are starts with 2 are: "+preList);

        //Using map() method

        List<Integer> preList2 = list4.stream().map(e->String.valueOf(e)).filter(e->e.startsWith("2") || e.startsWith("-")).map(Integer::valueOf).collect(Collectors.toList());
        System.out.println("The numbers which are starts with 2 are: "+preList2);

        System.out.println();
/*  8] Find the duplicate number from list using stream API  */

        List<Integer> list5 = Arrays.asList(1,2,1,3,4,4,5);

        //Using Collections.frequency() method
        Set<Integer> duplicateSet = list5.stream().filter(e-> Collections.frequency(list5,e)>1).collect(Collectors.toSet());
        System.out.println("Numbers which are duplicate in list5 are:" +duplicateSet);

        //Using Set (HashSet)

        Set<Integer> duplcateSet = new HashSet<Integer>();

        Set<Integer> duplicateNumber = list5.stream().filter(e->!duplcateSet.add(e)).collect(Collectors.toSet());
        System.out.println("Duplicate number using set is :"+ duplicateNumber);

        System.out.println();
/*  9] Find the Limit numbers from list (First 5 numbers ) and then find the sum of first 5 numbers */

        List<Integer> list6 = Arrays.asList(1,4,5,6,89,3,5);

        Optional<Integer> sum2 =list6.stream().limit(5).reduce(Integer::sum);
        System.out.println("Sum of first 5 numbers from list is : "+sum2.get());

        //Using lambada in reduce

        int sum3 = list6.stream().limit(5).reduce((a,b)->a+b).get();
        System.out.println("Sum of first five numbers using lambada is: "+sum3);

        
        //Skip numbers

        List<Integer> skipeedList = list6.stream().skip(5).collect(Collectors.toList());
        System.out.println("Skipped List is: "+skipeedList);

        //Skip list of numbers and get sum of numbers

        int sum4 = list6.stream().skip(5).reduce((a,b)->a+b).get();
        System.out.println("Sum of Skipped list is: "+ sum4);


/*  10] Find second highest and second-lowest number from list */

        List<Integer> list7 = Arrays.asList(1,2,3,9,64,6,7,7);
        int secondHighest = list7.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println("Second Highest number is: "+secondHighest);

        //Second-lowest number
        int secondLowest = list7.stream().sorted().distinct().skip(1).findFirst().get();
        System.out.println("Second lowest number is: "+secondLowest);


        System.out.println();
/*  11] Find the longest string from list of strings using stream api */

        List<String> words = Arrays.asList("Core java", "SpringBoot","Hibernate");

        String longestString = words.stream().reduce((word1, word2)->word1.length()>word2.length()?word1:word2).get();
        System.out.println("Longest string is: "+longestString);



        // Find the number greater than 5 and then do square of each number

        List<Integer> numList = Arrays.asList(10,2,3,4,5,6);

        List<Integer> resultList = numList.stream().filter(i->i>5).map(i->i*i).sorted().collect(Collectors.toList());
        System.out.println(resultList);












    }
}
