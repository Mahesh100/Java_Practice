package Array.deepakTutorial;

public class arrayTut_2D_array {

    /*
    2 Dimensional array

    -2 Dimensional array know as array of array

    #Declearation

    int[][] a;

    #Creation

    int[][] a = new int[2][3]   2 rows and 3 columns

    (0,0  0,1, 0,2)
    (1,0  1,1  1,2)

    #Initialization

    int[][] a = new int[2][3]



     */

    public static void main(String [] args){

        int[][] a = new int[2][3];


        int[][] a1 = {{10,20,30},{40,50,60}};

      //     System.out.println(a1[0][0]);


        for(int i=0; i<a1.length;i++){
            for(int j=0; j<a[i].length;j++){
                System.out.println(a1[i][j]+" ");
            }
            System.out.println();
        }

    }
}
