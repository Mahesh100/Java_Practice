package Array.deepakTutorial;

public class arrayTut_1 {

    int emp_id_1 = 101;
    int emp_id_2 = 102;

    int emp_id_3 = 103;

    /* now we have to store all this values into a single variable then
    here we can use arrays

    -Array is collection of homogenous data types
    - Index position of array is starts from 0 always.

    - In java array is consider as object as we have used 'new' keyword
    -If array is object then it must have the class (As every object is associated with class)

    -Super class of array is Object class

    -Array object occupies the memory inside the Heap memory (Heap area)

    -All object in java stores memory inside the Heap memory

    -Arrays are faster than the primitive data types.

    - The elements in an array are stored in consecutive memory locations.

    -Arrays are used to implement data structures like
       Linked List
       Stacks
       Queues
       Graphs

    # Disadvantages of arrays
      -Array has fixed size.

      -In array we can only store similar data types (Integer, String)

      -The elements in an array are stored in consecutive memory locations
       thus to delete an element in an array we need to traverse through whole
       array, this will reduce the performance.

     */

    int[] emp_Id = {101,102,103};

    String[] emp_name = {"M","K"};

    int emp_id[] = new int[1000];  //1000 is size of array here

    String emp_name2[] = new String[5];


}
