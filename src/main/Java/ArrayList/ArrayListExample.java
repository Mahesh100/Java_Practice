package ArrayList;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String [] args){

        int n =5;

        ArrayList<Integer> arr = new ArrayList<Integer>();

        ArrayList<Integer> arr1 = new ArrayList<>();

        for(int i=1; i<=n; i++ ){
            arr.add(i);
            arr1.add(i);
        }

        System.out.println(arr);
        System.out.println(arr1);
    }
}
