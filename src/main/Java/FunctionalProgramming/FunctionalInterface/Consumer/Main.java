package FunctionalProgramming.FunctionalInterface.Consumer;

import java.util.function.Consumer;

public class Main {
    public static void main(String [] args){
        Consumer<String> consumer = (s)-> System.out.println(s);
        consumer.accept("Mahesh");
    }
}
