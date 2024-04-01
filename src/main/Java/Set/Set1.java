package Set;

import java.util.HashSet;
import java.util.Set;

public class Set1 {

    public static void main(String[] args) {

        Set<String> set = new HashSet<String>();

        set.add("Apple");
        set.add("Mango");
        set.add("Grapes");
        set.add("Mango");

        System.out.println(set);



        for(String fruitSet : set)
        {
            System.out.println(fruitSet);
        }
    }
}
