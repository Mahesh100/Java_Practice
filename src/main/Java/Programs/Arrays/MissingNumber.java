package Programs.Arrays;

// Find missing number in integer array of 1 to 100

public class MissingNumber {
    public static void main(String[] args) {

        /*
        Find the length of original array
        Find the total sum of all the elements in array using (n*(n+1)/2)
        Iterate the array using for loop till arr.length
        sum = sum-arr[i];
         */

        int[] arr = {1,2,3,4,5,6,7};   //Missing number is here 6
        int n = arr.length+1;
        System.out.println(arr.length);
        int sum = (n*(n+1)/2);
        for (int i=0; i<arr.length; i++)
        {
            sum = sum-arr[i];
        }

        System.out.println("Missing Number: "+sum);

    }
}
