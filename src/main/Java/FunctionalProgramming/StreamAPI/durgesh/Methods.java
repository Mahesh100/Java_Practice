package FunctionalProgramming.StreamAPI.durgesh;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Methods {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5,4,3,2,1);

        //Get odd element from list

        List<Integer> oddList = list.stream().filter(i->i%2!=0).collect(Collectors.toList());
        System.out.println(oddList);

        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted list is: " +sortedList);

        //Create square of each number in list and return list

        List<Integer> sqList = list.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(sqList);


        //Return the list of names which are starts with letter 'A'

        String[] names = {"Anadnd", "Mahesh", "Aniket", "Vishal"};

        List<String> letters = Arrays.stream(names).filter(e->e.startsWith("A")).collect(Collectors.toList());
        System.out.println(letters);


    }
}