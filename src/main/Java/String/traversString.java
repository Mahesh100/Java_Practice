package String;


public class traversString {

    static void stringTraverse( String str){
        for(int i= 0; i<str.length(); i++){
            System.out.print(str.charAt(i)+ " ");
        }

    }

    public static void main(String [] args){
        String str = "Mahesh"; //custom input string

        stringTraverse(str);
    }
}
