package DSA.LinkedList;

import java.util.*;

// Insert at beginning : Add node at the head of Linked list
//Insert at the end: Add a new node at the tail of the linked list.

public class InsertAtBeginning {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);

        for(Integer finalList:list){
            System.out.println(finalList);
        }

        list.addFirst(0);
        list.addLast(4);

        System.out.println(list);
    }
}
