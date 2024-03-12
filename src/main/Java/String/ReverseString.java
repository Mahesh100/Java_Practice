package String;

public class ReverseString {

    public static void main(String [] args) {

        String str = "ABCD";

        System.out.println(str.length());

        for(int i=str.length()-1; i>=0; i--){        //str.length() -1 is taken to find the index of lost character
            System.out.print(str.charAt(i));
        }

    }

}
