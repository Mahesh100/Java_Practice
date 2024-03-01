package Sorting;

class SelectionSort{
    public static void main(String [] args){

        int arr[] = {64, 25, 12, 22, 11};
                System.out.println("The length of array is:" +arr.length);

                //Desired output is :  int arr[] = {11,12,22,25,64}

        System.out.println(arr[0]+ " "+arr[5]);

        //ArrayIndexOutOfBoundException

        //In order to sort the array we have to traversed it thorough the whole array
        //After the sorting it is clear that the 11 is at the lowest position
        //we have to replace 64 with 11 , we can swip it

        // {11,25,12,22,64} after on iteration the end output will look like this.

        // for the second positon which is 25 again the whole array is traversed in sequential manner

        //after traversing we found that 12 second most lowest/smallest element in array afer the 11
        /* so we are swaping 12 and 25

        now the array will look like {11,12,25,22,64}

        now for the third position, we are again traversing array in sequential manner
        after traversing we found that 22 is third lowest element in array

        so we are swaping 22 and 25 positions

        {11,12,22,25,64}
         */
    }
}