package FunctionalProgramming.LambadaExpression.Practice.Predicate;

import java.util.function.Predicate;

public class Test {

    public static void main(String[] args) {

        //Example 1
        Predicate<Integer> p =  i->(i>10);

        System.out.println(p.test(1));

        //Example 2  Check the length of given string is greater than 4 or not

        Predicate<String> pr = i->(i.length()>4);


        System.out.println( "Length of given string is greater than 4 : "+pr.test("Mahesh"));


    }
}
