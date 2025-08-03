package Practice.HashMap;

import java.util.HashMap;

public class TwoNullValuesInHashMap {
    public static void main(String [] args){
        HashMap<String,Integer> hashMap = new HashMap<>();

        hashMap.put("Apple",1);
        hashMap.put(null,2);
        hashMap.put("Mango",3);
        hashMap.put(null,4);   //If an attempt is made to insert a second null key,
                              // the put() method will overwrite the value associated with the existing null key.

        System.out.println(hashMap);
    }
}
