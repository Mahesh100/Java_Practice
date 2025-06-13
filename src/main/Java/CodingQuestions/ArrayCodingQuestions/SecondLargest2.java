package CodingQuestions.ArrayCodingQuestions;

// Find Second largest element from the array
/*

class largestElement{
	public static void main(String [] args)
	{
		int[] arr = {3,4,5,2,1};    //output : 5

		int largest = arr[0];

		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > largest)
			{
				largest = arr[i];
			}
		}
		//System.out.println("Largest Element is: "+ largest);
	}
}

*/
// Find Second largest element in array
class SecondLargest2 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 4, 3, 1, 3};

        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        if (arr.length < 2) {
            System.out.println("-1");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        /*
        *
        * */

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println("Second Largest element is: " + secondLargest);
        }
    }
}
