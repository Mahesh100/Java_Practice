package Sorting.BubbleSort;

public class Test {

    public static void main(String[] args) {

        int[] a = {36,19,29,12,5,4,5,6,7,8,3,5,7,8,9,90,0,3,2,45,6,7,8,9,0,0,-1,6,4,4,2,1111111};

        int temp;
        int flag = 0;
        for(int i=0; i<a.length; i++)
        {    //For number of rounds

            for(int j=0;  j<a.length-1; j++)
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
