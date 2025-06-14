package CodingQuestions.Practice;

public class SecondLargestElement {

    public static int getSecondLargestElement(int[] arr){

        int largest = arr[0];
        int secondLargest =Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                secondLargest= largest;
                largest =arr[i];
            } else if(arr[i]< secondLargest && arr[i]> largest){
                secondLargest =arr[i];
            }
        }
        return secondLargest;
    }
    public static void  main(String [] args){

        int[] arr = {1,2,3,4,5};

        int result = getSecondLargestElement(arr);

        System.out.println("Second Largest Element In Array is "+ result);
    }
}
