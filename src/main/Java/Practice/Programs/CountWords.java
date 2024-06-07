package Practice.Programs;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class CountWords {

    public static void main(String[] args) {

        Timer timer = new Timer();
        timer.schedule(new WordCountTask(), 0, 5000);
        //String str = "Mahesh";
    }
}
        class WordCountTask extends TimerTask {

            @Override
            public void run() {
                System.out.print("Enter the string : ");

                Scanner sc = new Scanner(System.in);
                String str = sc.nextLine();
                int count = 1;

                int length = str.length();

                //str.charAt(i) ==' ' && s.charAt(i+1)!=' '

                for (int i = 0; i < length - 1; i++) {
                    if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
                        count++;
                    }
                }
                System.out.println("Number of words in a String: " +  count);
                System.out.println();

//                if(str ==' '){
//                    run();
//                }
            }
        }


