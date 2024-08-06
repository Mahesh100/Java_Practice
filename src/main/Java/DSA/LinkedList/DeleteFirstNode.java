package DSA.LinkedList;


//Delete first node : Remove the first node of the linked list.

import java.util.LinkedList;

public class DeleteFirstNode {

    public static void main(String[] args) {

        LinkedList<String> fruitList = new  LinkedList<String>();

        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Grapes");
        System.out.println(fruitList);
        //remove apple

        fruitList.removeFirst();

        fruitList.remove(1);

        fruitList.add("Apple");
        fruitList.add("Grapes");

        System.out.println(fruitList);


    }
}
