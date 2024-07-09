package Searching_Algorithms.LinearSearch;

public class LinearSearchString {

    public static void main(String [] args){

        String[] str = {"Mahesh", "Kakde", "Abc"};

        String target = "Abc";

        for(int i=0; i<str.length; i++)
        {
            if(str[i].equals(target)){
                System.out.println(i);
            }
        }
    }
}
