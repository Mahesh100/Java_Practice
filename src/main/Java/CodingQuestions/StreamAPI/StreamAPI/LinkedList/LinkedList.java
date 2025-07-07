package CodingQuestions.StreamAPI.StreamAPI.LinkedList;

class LinkedList {

    class Node
    {
        int data;
        Node next = null;

        Node(int data){
            this.data =data;
            this.next = null;
        }

    }

    Node head = null;
    Node tail = null;

    public void addNodes(int new_data)
    {
        Node new_Node = new Node(new_data);

        if(head==null){

            head = new_Node;
            tail = new_Node;

        } else
        {    tail.next = new_Node;
            tail = tail.next;

        }
    }

    public void printMe() {
        Node temp = head;
        while(temp !=null)
        {
            System.out.print(temp.data + "->");
            temp= temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String [] args)
    {
        LinkedList linkedList = new LinkedList();
        linkedList.addNodes(1);
        linkedList.addNodes(2);
        linkedList.addNodes(3);
        linkedList.addNodes(4);
        linkedList.addNodes(5);
        linkedList.addNodes(6);

        linkedList.head.next.next.next = linkedList.head.next;

        linkedList.printMe();
        linkedList.findMiddleNode();
    }

    private void findMiddleNode(){
        Node slowPointer = head;
        Node fastPointer = head;

        while(fastPointer !=null && fastPointer.next != null){
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }
        System.out.println("The Middle element is :"+slowPointer.data);
    }
}

