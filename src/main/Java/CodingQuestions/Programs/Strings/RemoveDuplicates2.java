package CodingQuestions.Programs.Strings;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates2 {

    public static void main(String[] args) {
        String str = "java";
        System.out.println(removeDuplicates(str));
    }

    public static String removeDuplicates(String str)
    {
        Set<Character> myHashSet = new HashSet<>();

        StringBuffer sf = new StringBuffer();

        for(int i=0; i< str.length(); i++)
        {
            Character  c = str.charAt(i);
            if(!myHashSet.contains(c)){
                myHashSet.add(c);
                sf.append(c);
            }
        }
        return sf.toString();
    }


}



/*
 Steps :

 1) Create a String from which duplicates has to remove.
 2) Write a method removeDuplicates which accepts String as argument and it should return string.
 3) In removeDuplicate method create HashSet
 4) Create StringBuffer
 5) Loop through each character in string
 */
