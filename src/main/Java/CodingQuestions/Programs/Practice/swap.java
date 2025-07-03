package CodingQuestions.Programs.Practice;

public class swap {

    public static void main(String[] args) {

        swap.swapNumbers(20,30);

    }

    public static void swapNumbers(int a, int b){
            a= a+b;
            b= a-b;
            a= a-b;
        System.out.println("after swapping:"+a + "   "+b);
    }
}
