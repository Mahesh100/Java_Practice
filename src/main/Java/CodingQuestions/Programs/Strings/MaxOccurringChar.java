package CodingQuestions.Programs.Strings;

public class MaxOccurringChar {

    public static void main(String[] args) {

        String str = "Java";

        char[] strArr = str.toCharArray();

        System.out.println(strArr);

        int minChar;
        int maxChar;

//        for(int i=0; i<str.length()-1; i++){
//            if(str.charAt(i)==str.charAt(i+1)){
//
//            }
//        }

        for( minChar=0; minChar<strArr.length; minChar++)
        {
            for(maxChar=minChar; maxChar<strArr.length-1; maxChar++)
            {
                if (strArr[minChar]==strArr[maxChar])
                {
                    System.out.print(strArr[maxChar]);
                }
            }
        }
    }
}
