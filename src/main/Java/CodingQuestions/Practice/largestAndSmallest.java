package CodingQuestions.Practice;

public class largestAndSmallest {

    public static void largestAndSmallestElement(int[] arr) {
        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("Largest Element in array is: " + largest);
        System.out.println("Smallest Element in array is " + smallest);
    }

    public static void main(String[] args) {

        int[] arr = {12, 4, 5, 67, 3};
        largestAndSmallestElement(arr);
    }
}
