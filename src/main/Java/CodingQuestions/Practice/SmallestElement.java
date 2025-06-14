package CodingQuestions.Practice;

public class SmallestElement {

    public static int smallestElement(int[] arr){

        int smallest = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]<smallest){
                smallest =arr[i];
            }
        }
        return smallest;
    }
    public static void main(String [] args){

        int[] arr = {4,3,5,2,5,1,1,3};

        int result = smallestElement(arr);

        System.out.println("Smallest Element In Array is: "+result);
    }
}
