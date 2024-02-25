package Deepak_tutorial.Exception.ExpTut_1;

public class Test {
    public static void main(String [] args){
        System.out.println("1");
        System.out.println("2");

        System.out.println("3");
        System.out.println("4");
        try
        {
            System.out.println(6/0);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }

        System.out.println("5");
        System.out.println("6");
        System.out.println("7");


    }
}
