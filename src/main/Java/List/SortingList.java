package List;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class SortingList {

    public static void main(String[] args) {

        List<String> animalList = new ArrayList<String>();

        animalList.add("Dog");
        animalList.add("Cat");
        animalList.add("Goat");
        animalList.add("Cow");

        System.out.println("Unsorted Collection is:" +animalList);
        Collections.sort(animalList);

        System.out.print("Sorted List is : ");

        for(String list :animalList)
        {

            System.out.print(list+",");
        }

    }
}
