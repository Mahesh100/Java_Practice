package Programs.Arrays;

public class SecondLargestElement2 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,5,6,7,0,1,9};

        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>largest){
                second_largest =largest;
                largest =arr[i];
            }

            if(arr[i]>second_largest && arr[i] !=largest)
            {
                second_largest=arr[i];
            }
        }
        System.out.println(second_largest);
    }
}

