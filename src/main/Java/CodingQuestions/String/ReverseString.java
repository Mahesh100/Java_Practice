package CodingQuestions.String;

public class ReverseString {

    public static void reverseString(String str){

        String[] strArr = str.split(" ");

        for(int i=strArr.length-1; i>=0; i--){
           System.out.print(strArr[i]+" ");
        }
    }

    public static void main(String[] args){

        String str = "My Name Is Mahesh";
        reverseString(str);
    }
}
