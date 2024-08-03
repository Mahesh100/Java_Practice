package DSA.LinkedList;

import java.util.LinkedList;

public class LinkedList1 {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.add("Mahesh");
        ll.add("Vinay");
        ll.add("John");


        System.out.println(ll);

        ll.add(2,"Jack");

        System.out.println(ll);

        ll.add("null");

        System.out.println(ll);

    }
}
