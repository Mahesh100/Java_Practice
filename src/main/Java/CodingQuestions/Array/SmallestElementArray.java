package CodingQuestions.Array;

public class SmallestElementArray {

    public static void main(String[] args) {

        int[] arr = {3, 2, 5, 4, 1};

        int smallest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("Smallest element is: " + smallest);
    }
}
