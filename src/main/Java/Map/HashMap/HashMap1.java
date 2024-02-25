package Map.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

    public static void main(String[] args) {
        ArrayList al =new ArrayList();
        al.add(101);
        al.add(102);

        System.out.println(al);


        Map map = new HashMap();

        map.put(101, "Deepak");   //101 and Deepk are the objects
        map.put(102, "Mahesh");
        map.put(103,"Rahul");
        map.put(104,"Yes");

        System.out.println(map);

//        map.clear();
//
        System.out.println(map.containsKey(014));
        System.out.println(map.containsValue("S"));

        System.out.println(map.get(103));

        System.out.println("Sise of Map is:"+ map.size());
    }
}
