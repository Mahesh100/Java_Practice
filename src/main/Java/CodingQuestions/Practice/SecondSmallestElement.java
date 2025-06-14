package CodingQuestions.Practice;

public class SecondSmallestElement {
    public static int secondSmallestElement(int[] arr){

        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]<smallest){
                secondSmallest =smallest;
                smallest = arr[i];
            } else if( arr[i] > smallest && arr[i]< secondSmallest){
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }

    public static void main(String [] args){

        int[] arr = {2,3,45,1,2,6};
        int result= secondSmallestElement(arr);
        System.out.println("Second Smallest Element from array is "+result);
    }

}
