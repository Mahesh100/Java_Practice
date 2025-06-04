package Collections.HashMapPractice;


import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HashMapProgramTest {

    @Test
    public void testPopulateHashMap() {
        // Create a HashMap and an instance of HashMapProgram
        HashMap<String, Integer> hashMap = new HashMap<>();
        HashMapProgram program = new HashMapProgram();

        // Call the method to populate the HashMap
        program.populateHashMap(hashMap);

        // Assertions to check the contents of the HashMap
        assertEquals(4, hashMap.size()); // Check the size
        assertTrue(hashMap.containsKey("Customer1")); // Check for key existence
        assertEquals(1, hashMap.get("Customer1").intValue()); // Check value for key

        assertTrue(hashMap.containsKey("Customer2"));
        assertEquals(2, hashMap.get("Customer2").intValue());

        assertTrue(hashMap.containsKey("Customer3"));
        assertEquals(3, hashMap.get("Customer3").intValue());

        assertTrue(hashMap.containsKey("Customer4"));
        assertEquals(4, hashMap.get("Customer4").intValue());
    }
}
