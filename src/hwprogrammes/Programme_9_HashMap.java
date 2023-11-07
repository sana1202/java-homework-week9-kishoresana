package hwprogrammes;

import java.util.HashMap;
import java.util.Map;

/*
Create a HashMap object called people that will store String keys and Integer values:
And use for each loop to iterate the value from Map.
 */
public class Programme_9_HashMap {
        public static void main(String[] args) {
            // Create a HashMap object
            HashMap<String, Integer> people = new HashMap<>();

            // Add key-value pairs to the HashMap
            people.put("Vivek", 25);
            people.put("Vijay", 30);
            people.put("Venu", 22);
            people.put("Ven Van", 50);

            // Iterate over the values in the HashMap using a for-each loop
            for (Map.Entry<String, Integer> list : people.entrySet()) {
                System.out.println(list.getValue() + " " + list.getKey());
            }
        }
    }
