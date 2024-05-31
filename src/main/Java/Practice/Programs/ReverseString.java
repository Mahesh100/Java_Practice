package Practice.Programs;

public class ReverseString {

    public static void main(String[] args) {


        String str = "Mahesh";

        int strLength = str.length();
        String reverse ="";
        for (int i = strLength - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        System.out.println(reverse);
    }
}