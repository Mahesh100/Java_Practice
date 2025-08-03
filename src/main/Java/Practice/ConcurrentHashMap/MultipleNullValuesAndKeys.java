package Practice.ConcurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

public class MultipleNullValuesAndKeys {
    public static void main(String [] args){

        ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();

        concurrentHashMap.put("Apple",2);
        concurrentHashMap.put("Banana",3);
        concurrentHashMap.put(null,4);
        concurrentHashMap.put(null,null);    //Both lines will throw nullPointerException

        System.out.println(concurrentHashMap);

    }
}
