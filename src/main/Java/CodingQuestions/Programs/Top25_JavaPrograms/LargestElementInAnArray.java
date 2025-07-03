package CodingQuestions.Programs.Top25_JavaPrograms;

public class LargestElementInAnArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3};

        int largest = arr[0];

        for(int i=0; i<arr.length; i++)
        {
            if (arr[0] < arr[i])
            {
                largest = arr[i];
            }
        }
        System.out.println("Largest Number is"+ "  "+largest);
    }
}
