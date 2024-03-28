package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {

    public static void main(String [] args)
    {
        String[] arr = {"Apples","Mango","Banana","Watermelon"};


        System.out.println("Printing Array: "+ Arrays.toString(arr));
        List<String> list = new ArrayList<String>();

        for(String fruitList:arr){
            list.add(fruitList);
        }
        
        System.out.println("Printing List: " +list);
    }
}
