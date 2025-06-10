package CodingQuestions.ArrayCodingQuestions;

public class ReverseArray {

    static void reverse(int[] arr){
        int i = 0;
        int j = arr.length-1;

        while (i<j){
            int t = arr[i];
            arr[i] = arr[j];
            arr[j]= t;
            i++;
            j--;
        }
    }

    public static void  main(String [] args){

        // we have array of {1,2,3,4,5,6,7,8}

        // reversed array is {8,7,6,5,,3,2,1}

        int[] arr = {1,2,3,4,5,6,7,8};

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        reverse(arr);

        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        /*           i              j

        - position of index element should swap
        - i need to move forward and j needs to be move backward
        - i++ and j--
        while(i<=j)
        swap(arr[i],arr[j])
        i++
        j--
         */

    }
}
