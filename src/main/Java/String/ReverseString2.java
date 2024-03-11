package String;

public class ReverseString2 {
    public static void main(String[] args) {


        /*
        * 4 ways to Reverse a String in java
        *
        * Using toCharArray() method
        *
        * Using charAt(int index) method
        *
        * using reverse() method provided by stringBuffer class
        *
        * using reverse() method provided by stringBuilder class
        *
        * */



        //Approach-1

        //Converting string to character array

        String str = "Hello";    //output olleH

        int length = str.length();

        System.out.println(length);

        char[] chArr = str.toCharArray();

        System.out.println(chArr);

        for(int i=str.length()-1; i>=0; i--){
            System.out.print(chArr[i]);
        }


    }
}
