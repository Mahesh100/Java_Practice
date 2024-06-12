package Programs.Practice;

public class PalindromeString {
    public static void main(String[] args) {

        String str = "MOM";

        int length = str.length();

        String reverse = "";

        for(int i=length-1; i>=0; i--)
        {
            reverse = reverse+str.charAt(i);
        }
        if(str.equals(reverse)){
            System.out.println(str+" is palindrome string");
        }else {
            System.out.println(str+" is not palindrome string");
        }
    }
}
