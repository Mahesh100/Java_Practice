package Practice.ConcurrentHashMap;

import java.util.concurrent.*;

public class ConcurrentHashMapDemo {
    public static void main(String [] args){
        ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<>();

        map.put("Mahesh",1);
        map.put("Kakde",2);
        map.put("Renuka",3);
        map.put("Kakde",4);

        System.out.println(map);

    }
}
