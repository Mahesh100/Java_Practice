package List.ArrayList;

import Deepak_tutorial.Encapsulation.A;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList2 {

    public static void main(String[] args) {


        ArrayList al = new ArrayList();
        al.add("Mango");
        al.add("Mango");
        al.add("Apple");

        System.out.println(al);


        LinkedList li = new LinkedList();
        li.push("Mango");
        li.push("apple");
        li.push("Mango");

        li.add("Mango");
        li.add("apple");
        li.add("Mango");

        System.out.println(li);
    }
}
