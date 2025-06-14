package CodingQuestions.Array;

public class LargestElementInArray {
    //Brute force solution

    public static void main(String[] args) {



/*
        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]);


            if (i < arr.length-1){
                System.out.print(",");
            }

        }
        System.out.println();
        System.out.println("Largest element in array is: "+ arr[(arr.length-1)]);

 */
        int[] arr = {3, 2, 1, 5, 2};

        int largest = arr[0];   //largest =3, largest =2, largest =1, largest =5
        int smallest = arr[0];

        for (int i = 0; i < arr.length; i++) {  // i=0,1,2,3,4
            if (arr[i] > largest) {     // 3>3 -> false,| 2>3 ->false | 1>2 -> false |5>1 ->true| 2>5-> false
                largest = arr[i];     // No execution, largest 5
            }

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("Largest element is: " + largest);
        System.out.println("Smallest element is: " + smallest);

    }

}
