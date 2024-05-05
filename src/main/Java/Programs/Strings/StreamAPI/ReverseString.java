package Programs.Strings.StreamAPI;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {

    public static void main(String[] args) {
        String str = "JAVA";
        System.out.println( reverseString(str));
        //Output : AVAJ
    }
    
    public static  String reverseString(String str)
    {
        //Converting String into Stream

     String result= Stream.of(str).map(String->new StringBuffer(str).reverse()).collect(Collectors.joining(str));    //map() is intermidate operation

        return result;
    }
}

/*
 Steps :
 1) Define string which is to be reversed
 2) Define method reverseString which accepts string as parameter and return the String
 3) Convert the String to Stream of objects
 */
