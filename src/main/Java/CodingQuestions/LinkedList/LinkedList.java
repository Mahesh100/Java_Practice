package CodingQuestions.LinkedList;

class Node{
    int data;
    Node next;

    Node(int data,Node next1){
        this.data =data;
        this.next =next1;
    }

    Node(int data1){
        this.data=data1;
        this.next =null;
    }
}
public class LinkedList {
    public static void main(String [] args){
        int[] arr = {2,5,6,8};
        Node y = new Node(arr[0]);
        System.out.println(y.data);
    }
}
