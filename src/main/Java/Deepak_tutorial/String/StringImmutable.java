package Deepak_tutorial.String;

import java.util.*;
public class StringImmutable {

    public static void main(String[] args) {
        String s = new String("Deepak");  //Two objects are created in Heap area and String constant pool

        s.concat("Java");  //This will create in heap area

        System.out.println(s);
    }
}
