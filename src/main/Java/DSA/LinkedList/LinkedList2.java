package DSA.LinkedList;

import java.util.LinkedList;

public class LinkedList2 {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("One");
        list.add("Two");
        list.add("Three");

        System.out.println(list);


        for(String resultList:list){
            System.out.println(resultList);
        }

//        for(int i=0; i<list.size(); i++){
//            System.out.println(list.get(i));
//        }
    }
}
