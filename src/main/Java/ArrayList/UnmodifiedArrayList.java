package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiedArrayList {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Apple");
        al.add("Mango");
        al.add("Banana");

        System.out.println(al);

        List <String> redOnlyList = Collections.unmodifiableList(al);
        try {
            redOnlyList.add("J");
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
