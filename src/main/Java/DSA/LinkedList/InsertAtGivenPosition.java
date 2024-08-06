package DSA.LinkedList;

import java.util.LinkedList;

//Insert at given position: Add a node at specific index within the linked list
public class InsertAtGivenPosition {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(3);
        list.add(4);

        System.out.println(list);

        list.add(1,2);

        System.out.println(list);




    }
}
