package CodingQuestions.Practice;

public class largestElementInArray {

    public static int largestElement(int[] arr){
        int largest = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                largest =arr[i];
            }
        }
        return largest;
    }
    public static void main(String [] args){

        int[] arr = {1,2,7,2,3,9,4};

        int result = largestElement(arr);
        System.out.println("Largest Element In array is: "+ result);
    }
}
