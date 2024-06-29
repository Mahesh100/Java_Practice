package Map.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String [] args){


        ArrayList al = new ArrayList();

        al.add("Mango");
        al.add("Banana");
        System.out.println(al);

        //------------------------

        Map map = new HashMap();  //Created object of implemented class which is HashMap/ mp is the object of HashMap class

        map.put(101,"deepak");   //101 is not integer but it is object
        map.put(102,"Amit");
        map.put(103,"Dipesh");
        map.put(103,"Ramesh");

        //map.clear();
       boolean a=  map.containsKey(101);

       map.entrySet();
       System.out.println(map.entrySet());
        System.out.println(map.get(101));

        System.out.println(map.size());

    }
}
