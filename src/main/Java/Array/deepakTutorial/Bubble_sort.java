package Array.deepakTutorial;

public class Bubble_sort
{
    public static void main(String [] args)
    {

        int[] a = {39,20,45,1};

        for(int i =0; i<a.length; i++){
            System.out.println("Round is :"+i+" ");

            for(int j= 0; j<a.length-1-i; j++)

            {

                if(a[j]>a[j+1])
                {
                  int temp = a[j];
                  a[j] = a[j+1];
                  a[j+1] = temp;
                }
            }
        }

        for(int i = 0; i<a.length; i++){
            System.out.println("Sorted array is"+" "+a[i]);
        }
    }
}