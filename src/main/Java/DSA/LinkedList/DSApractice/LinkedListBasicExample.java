package DSA.LinkedList.DSApractice;

public class LinkedListBasicExample {
    Node head;
    class Node{
        String data;
        Node next;


        Node(String data){
            this.data=data;
            this.next=null;
        }
        // Add operation first


    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next=head;
        head= newNode;
    }


    public static void main(String [] args){
        LinkedListBasicExample list = new LinkedListBasicExample();
        list.addFirst("a");
        list.addFirst("is");

//        for(String resultList: list ){
//
//        }

    }
}
