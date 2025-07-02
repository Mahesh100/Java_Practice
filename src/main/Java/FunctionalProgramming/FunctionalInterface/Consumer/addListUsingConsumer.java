package FunctionalProgramming.FunctionalInterface.Consumer;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class addListUsingConsumer {
    public static void main(String [] args){
        Consumer<List<Integer>> listConsumer = s->{
            for(Integer i: s){
                System.out.println(i+100);
            }
        };
        listConsumer.accept(Arrays.asList(1,2,3,4));
    }
}
