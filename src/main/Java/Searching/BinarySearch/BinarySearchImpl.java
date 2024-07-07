package Searching.BinarySearch;

public class BinarySearchImpl {

    public static void main(String[] args) {

        int[] arr = {1,2,4,5,7,8,9,10};

        int item = 10;

        int li=0;
        int hi= arr.length-1; //7
        System.out.println(hi);
        int mi= (li+hi)/2;   //3
        System.out.println(mi);

        while (li<=hi){  //true
            if(arr[mi]==item)   //false
            {
                System.out.println("Element is present at "+mi+ " and element is "+arr[mi]);
                break;
            }
            else if (arr[mi]<item){   //true
                li =mi+1;   //4th index with item 7   | 9 value and 6th index li=6
            }
            else {
                hi=mi-1;
            }
            mi=(li+hi)/2;    //4+7/2 =5th index  | 6+7/2 =7

        }
    }
}
