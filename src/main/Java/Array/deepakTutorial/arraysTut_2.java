package Array.deepakTutorial;

public class arraysTut_2 {

    public static void main(String[] args) {

    /*
 --->   Types of Arrays

    1) Single dimensional

    1-D arrays

    2) Multi dimensional

    2-D array
    3-D array


---> 1D  Arrays
    Declaration

    Initialization

    -As soon as array is declared default values get initialize by zero

    -Insert values in array  a[0] = 10;

    -If at any position value is not declare then default value is taken
     */

        //int a;
        //String c;

        int[] a;   //read as : a is one-dimensional int array

        int[] b = new int[3];

        b[0]= 10;
        b[1]= 20;
        b[2]= 30;


        int[] b1 = {10, 20, 30, 40};

        for(int i=0; i<b1.length; i++){
            System.out.println(b1[i]);
        }

        //by using forEach loop

        for(int i: b1){
            System.out.println(i);

        }

       // System.out.println("values are :"+b1);
    }

}
