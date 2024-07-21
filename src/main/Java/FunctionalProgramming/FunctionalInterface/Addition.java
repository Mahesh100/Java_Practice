package FunctionalProgramming.FunctionalInterface;
//Implemented simple functional interface for sum of two numbers

public class Addition {

    public static void main(String[] args) {


    Calculator addition = (a,b)-> (a+b);

    int result = addition.calculate(5,3);
        System.out.println(result);
  }
}
