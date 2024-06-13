package FunctionalProgramming.StreamAPI.durgesh;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {

    public static void main(String[] args) {

        // 1st Method
        Stream<Object> emprtyStream = Stream.empty();
        System.out.println(emprtyStream);

        // 2nd Method using array

        String[] names = {"Durgesh","Uttam", "Aniket","Divya"};
       Stream<String> stream1 = Stream.of(names);
       stream1.forEach(e->{
           System.out.println(e);
       });

       // 3rd method using Builder pattern
        Stream<Object> streamBuilder = Stream.builder().build();

        // 4th Method using Arrays  (anonymous array)
        IntStream stream = Arrays.stream(new int[]{2,4,65,3,5});
        stream.forEach(e->{
            System.out.print(e+",");
        });


        //  Using collection object List/set/Map

        List<Integer> list1 = new ArrayList<>();
        list1.stream().forEach(e->{
            System.out.println(e);
        });
    }
}
