package CodingQuestions.Programs.Practice;
//
//import java.util.Scanner;
//import java.util.Timer;
//import java.util.TimerTask;
//
//public class CountWords {
//
//    public static void main(String[] args) {
//        String str = "Mahesh Kakde";
//
//        int count = 1;
//
//        int length = str.length();
//
//        System.out.println(length);
//
//        //str.charAt(i) ==' ' && s.charAt(i+1)!=' '
//
//        for (int i = 0; i < length - 1; i++) {
//            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
//                count++;
//            }
//        }
//        System.out.println("Number of words in a String: " +  count);
//        System.out.println();
//
//
//
//    }
//}
//        class WordCountTask  {
//
//
//
//
//        }
//
//


class CountWords{

    public static void main(String[] args) {
        String str = "Mahesh Kakde";
        int count = 1;

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)==' ' && str.charAt(i+1)!=' '){
                count++;
            }

        }
        System.out.println(count);
    }

}