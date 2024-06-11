package Programs.Practice;
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
        String str = "HR: What salary do you expect?\n" +
                "Candidate: Around ₹150,0000 to ₹160,0000 a year.\n" +
                "\n" +
                "HR: You're perfect for the job, but we can only offer ₹1200000.\n" +
                "\n" +
                "Candidate: Okay, ₹1200000 works for me.\n" +
                "\n" +
                "HR: When can you start?\n" +
                "\n" +
                "Meanwhile, the company could afford up to ₹155,0000 for the role. They feel proud for negotiating a lower salary. But the new employee notices the pay gap and feels unhappy.\n" +
                "\n" +
                "Two months later they leave for a better job. Then the hiring process starts again, costing more money and causing problems in the team.\n" +
                "\n" +
                "To keep good employees pay them properly.\n";
        int count = 1;

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)==' ' && str.charAt(i+1)!=' '){
                count++;
            }

        }
        System.out.println(count);
    }

}