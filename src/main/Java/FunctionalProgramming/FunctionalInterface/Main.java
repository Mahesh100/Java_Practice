package FunctionalProgramming.FunctionalInterface;

public class Main {
    public static void main(String[] args) {

        MyFunctionalInterface function = ()-> System.out.println("This is My functional Interface");
        function.myMethod();
    }
}
