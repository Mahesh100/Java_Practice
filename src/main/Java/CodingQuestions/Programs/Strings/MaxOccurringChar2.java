package CodingQuestions.Programs.Strings;

import java.util.Scanner;

public class MaxOccurringChar2 {
    public static void main(String[] args) {

        String a = "abbccc";
//
//        i<a.length()  or i<=a.length()-1;
        System.out.println(a.length()-1);
        System.out.println("Enter String : ");

        Scanner sc = new Scanner(System.in);

       String str = sc.next();

       int len = str.length();

       int max =-1;
       char result = 0;
       int[] count = new int[256];

       for(int i=0; i<len; i++)
       {
           count[str.charAt(i)]++;
       }



    }
}
