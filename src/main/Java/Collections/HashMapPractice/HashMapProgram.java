package Collections.HashMapPractice;

import java.util.HashMap;
import java.util.HashSet;


public class HashMapProgram {

    public void populateHashMap(HashMap<String,Integer> hashMap){
        // Add elements to hashMap
        hashMap.put("Customer1", 1);
        hashMap.put("Customer2",2);
        hashMap.put("Customer3",3);
        hashMap.put("Customer4",4);
    }

    public static void main(String [] args){
        // Create a hashMap
        HashMap<String,Integer>  hashMap = new HashMap<>();
        HashMapProgram program = new HashMapProgram();
        program.populateHashMap(hashMap);




        System.out.println("Get first customer"+hashMap.get("Customer1"));

        System.out.println(hashMap);

    }
}
