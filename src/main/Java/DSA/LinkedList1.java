package DSA;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("l");

        System.out.println(list);

        list.push("e");
        list.push("l");

        System.out.println(list);


    }
}
