package CodingQuestions.Programs.Strings;

import java.util.HashSet;

public class demo {

    /*
    1) Define the String from which duplicate should be removed
    2) Define the method removeDuplicate which accept String as Parameter and return the String
    3) Define HashSet in remove Duplicate method which stores the Characters
    4) Define new String Buffer class
    5) Loop through the every character of String
    6) Inside loop Co
     */

    public static void main(String[] args) {
        String str = "Java";
       // removeDuplicate(str);
        System.out.println(removeDuplicate(str));

    }

    public static String removeDuplicate(String str)
    {
        HashSet<Character> set = new HashSet<>();

        StringBuffer sf = new StringBuffer();

        for(int i=0; i<str.length(); i++)
        {
            Character ch = str.charAt(i);   //Convert the string into characters
         //   System.out.print(ch);

            if(!set.contains(ch))
            {
                set.add(ch);
                sf.append(ch);
            }
        }

        return sf.toString();
    }
}
