package FunctionalProgramming.StreamAPI.ListOfAllStreamAPIPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

        int sum = list3.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of all integer elements in List is : "+ sum);





    }
}
