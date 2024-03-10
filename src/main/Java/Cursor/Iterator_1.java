package Cursor;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class Iterator_1 {

    public static void main(String[] args) {

        List l = new ArrayList<>();  //We have created collection Object l here
        l.add(10);
        l.add("Deepak");
        l.add("Rahul");


        //Getting iterator

        Iterator it = l.iterator();

        while (it.hasNext()){

            System.out.println(it.next());
        }
    }
}
