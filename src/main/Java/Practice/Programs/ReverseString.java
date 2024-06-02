package Practice.Programs;




public class ReverseString {
//Reverse string in java
    public static void main(String[] args){

        String str = "Mahesh";

        int length = str.length();
        String reverse ="";
        for(int i=length-1; i>=0; i--){
            reverse = reverse+str.charAt(i);
        }

        System.out.println(reverse);

    }
}