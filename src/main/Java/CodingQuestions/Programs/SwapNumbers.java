package CodingQuestions.Programs;


//Program to swap two numbers without using third variable
public class SwapNumbers {
    public static void main(String[] args) {

        int a =20; int b = 50;

        a = a+b;
        b=  a-b;
        a=  a-b;

        System.out.println(a +" "+ b);
    }
}
