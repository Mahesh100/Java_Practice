package Practice.HashMap;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String [] args){

        HashMap<String,String> wordDefinitions = new HashMap<>();
        wordDefinitions.put("Chair", "A structure used for sitting");
        wordDefinitions.put(null,"null");
        wordDefinitions.put("Table","A structure having 4 legs");


        System.out.println(wordDefinitions);

        String result = wordDefinitions.get("Chair");
        System.out.println(result);
        System.out.println(wordDefinitions.containsKey("Chair"));
    }
}
