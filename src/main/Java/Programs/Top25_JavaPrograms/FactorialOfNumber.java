package Programs.Top25_JavaPrograms;

import java.util.Scanner;

public class FactorialOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");

        int number = sc.nextInt();

        int factorialNumber =1;
        for (int i=1; i<=number; i++)
        {
            factorialNumber = factorialNumber*i;
        }

        System.out.println(factorialNumber);
    }
}
