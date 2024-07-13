package Programs.Arrays;

public class SecondLargestElement {

    public static void main(String[] args) {

        //Find the Second-largest element in an array

        int[] arr = {6, 8, 2, 4, 3, 1, 5, 7};

        int temp;
        int target =
        for (int i = 0; i < arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                 if(arr[i]<arr[j])
                 {
                     temp = arr[i];
                     arr[i]=arr[j];
                     arr[j]=temp;
                 }
            }

        }

        System.out.println(arr[1]);
    }

}
