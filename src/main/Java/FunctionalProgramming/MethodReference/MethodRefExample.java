package FunctionalProgramming.MethodReference;

import java.util.Arrays;

public class MethodRefExample {

    public static void print(String s){
        System.out.println(s);
    }

    public static void main(String [] args){

        String[] names = {"Name1","Name2","Name3"};

        Arrays.stream(names).forEach(s->MethodRefExample.print(s));
    }
}
