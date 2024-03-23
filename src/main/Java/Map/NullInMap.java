package Map;

import java.util.HashMap;
import java.util.Map;

public class NullInMap {

    public static void main(String [] args)
    {
        Map map = new HashMap();

        map.put(null,"Mahesh");
        map.put(null,"Kakde");

        System.out.println(map);
    }
}
