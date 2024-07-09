package Searching_Algorithms.LinearSearch;

public class LinearSearchImple {

    public static void main(String[] args) {

        int[] arr = {5,3,6,1,4,2};   //Unsorted array

        System.out.println(arr.length);

        int x = 5;
        int temp =0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==x){
                System.out.println("Element is present at index :"+i+ " " +"and element is "+ arr[i]);
                temp=temp+1;  //to increment value of temp
            }
        }
        if (temp==0){
            System.out.println("Element is not present in array");
        }
    }
}
