package Practice.HashMap;

import java.util.HashMap;

public class SubjectsHashMap {

    public static void main(String [] args){

        HashMap<String,Integer> subject = new HashMap<>();
        subject.put("Physics",34);
        subject.put("Math",85);
        subject.put("Chemistry",100);

        System.out.println(subject);
        System.out.println(subject.get("Physics"));


    }
}
