package Programs.Strings;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class LowerCaseToUpperCase {

    public static void main(String[] args) {

        List<String> vehicles = Arrays.asList("bus", "car");

        List<String> vehiclesList = new ArrayList<String>();

        for(String name:vehicles){
            System.out.println(name.toUpperCase());
        }
    }
}
