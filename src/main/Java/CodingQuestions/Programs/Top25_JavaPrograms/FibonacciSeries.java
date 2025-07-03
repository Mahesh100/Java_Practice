package CodingQuestions.Programs.Top25_JavaPrograms;

//Fibonacci series is a sequence where each number is sum of two preceding digits.

public class FibonacciSeries {

    public static void main(String[] args) {


    int count=5;
    int firstTerm =0;
    int secondTerm = 1;

    for(int i=0; i<=count; i++ )
    {
        System.out.print(firstTerm+"  ");

        int nextTerm = firstTerm+secondTerm;
        firstTerm=secondTerm;
        secondTerm=nextTerm;
    }
 }
}