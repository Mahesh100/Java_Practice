package Searching_Algorithms.BinarySearch;

public class BinarySearchImpl {

    public static void main(String[] args) {

        int[] arr = {1,2,4,5,7,8,9,10};   //Sorted array always

        int item = 10;    // Target element

        int li=0;

        int hi= arr.length-1;
        System.out.println(hi);  //7

        int mi= (li+hi)/2;
        System.out.println(mi);   //3

        while (li<=hi){
            if(arr[mi]==item)
            {
                System.out.println("Element is present at "+mi+ " and element is "+arr[mi]);
                break;
            }
            else if (arr[mi]<item){
                li =mi+1;   //4th index with item 7   | 9 value and 6th index li=6
            }
            else {
                hi=mi-1;
            }
            mi=(li+hi)/2;    //4+7/2 =5th index  | 6+7/2 =7

        }
    }
}
