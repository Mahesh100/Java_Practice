package List;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String [] args)
    {
        //Creating list of fruits

        List<String> fruit = new ArrayList<String>();

        fruit.add("Mango");
        fruit.add("Banana");
        fruit.add("Watermelon");
        fruit.add("Coconut");

        for (String fruits:fruit){
            System.out.println(fruits);
        }

    }
}
