package Set.hashSet;

import java.util.*;

public class HashSet1 {

    public static void main(String[] args) {

        HashSet<Integer> myHashSet = new HashSet<>();

        myHashSet.add(1);
        myHashSet.add(1);
        myHashSet.add(5);
        myHashSet.add(0);
        myHashSet.add(4);
        myHashSet.add(null);
        myHashSet.add(null);

        System.out.println(myHashSet);
    }
}
