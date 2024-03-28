package List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Main_Iterator {

    public static void main(String [] args){

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars);

        //Get Iterator
        Iterator<String> it = cars.iterator();

        System.out.println(it.next());

        while (it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }


    }
}
