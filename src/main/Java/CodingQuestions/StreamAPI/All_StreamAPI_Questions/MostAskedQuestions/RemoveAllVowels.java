package CodingQuestions.StreamAPI.All_StreamAPI_Questions.MostAskedQuestions;

import java.util.Arrays;

/*
* Given a String remove all the vowels from string
*
* */
public class RemoveAllVowels {
    public static void main(String [] args){
        String str = "HelloWorld";   //OutPut : Hllwrld

        //Wrong answer
//        Arrays.stream(str.split(" ")).filter(x->x.replaceAll("[^aeiouAEIOU]","").trim())
//                .forEach(System.out::println);
        Arrays.stream(str.split(" ")).filter(x->x.replaceAll("[^aeiouAEIOU]","").length()==2).
                forEach(System.out::println);
    }
}
