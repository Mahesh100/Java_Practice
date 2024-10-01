package String;

import java.util.Arrays;

public class findLargestWordInString {
    public static void main(String [] args) {
        String sentence = "I am a good programmer";
        System.out.println(findlargestWord(sentence));
    }
       // String[] word = sentence.split(" ");

       // System.out.println(Arrays.toString(word));

         private static String findlargestWord(String sentence){
                String[] words = sentence.split(" ");
                String largestWord= "";
                String SecondLargest="";

                for(int i=0; i<words.length; i++){
                    if(words[i].length()>largestWord.length()){  // "", I
                            largestWord =words[i];   //I am

                    }
                }
             return largestWord;
        }

}
