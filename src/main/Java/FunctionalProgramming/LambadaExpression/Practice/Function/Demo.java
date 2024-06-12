package FunctionalProgramming.LambadaExpression.Practice.Function;

import java.util.function.Function;

public class Demo {

    public static void main(String[] args) {

        //Function Chaining concept

        Function<Integer,Integer> f1= n->n*2;

        Function<Integer,Integer> f2= n->n*n*n;

        System.out.println( f1.andThen(f2).apply(2));  //64

        System.out.println( f1.compose(f2).apply(2));  //16

    }
}
