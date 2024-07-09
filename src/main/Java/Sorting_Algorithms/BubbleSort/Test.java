package Sorting_Algorithms.BubbleSort;

public class Test {

    public static void main(String[] args) {

        int[] a = {36,19,29,12,5,4,5,};   //Unsorted array

        int temp;
        int flag = 0;

        for(int i=0; i<a.length; i++)
        {    //For number of rounds

            for(int j=0;  j<a.length-1-i; j++)
            {
                if(a[j]>a[j+1])
                {
                    temp =a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag=1;
                }
                if(flag==0){
                    break;
                }
            }

        }

        for(int i=0; i<a.length; i++)
        {
            System.out.println(a[i]+ " ");
        }
    }
}
