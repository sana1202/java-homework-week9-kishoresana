package hwprogrammes;

import java.util.ArrayList;
import java.util.Iterator;

/*
Write a Java program to iterate through all elements in an array list using Iterator
 */
public class Programme_5_ArrayIterator {
        public static void main(String[] args) {
            // Create a new ArrayList to store elements
            ArrayList<String> cuisines = new ArrayList<>();

            // Add elements to the ArrayList
            cuisines.add("Indian");
            cuisines.add("Mexican");
            cuisines.add("Chinese");
            cuisines.add("Junk");

            // Create an Iterator to iterate through the elements
            Iterator<String> iterator = cuisines.iterator();

            // Use the iterator to iterate through the ArrayList
            System.out.println("Cuisines in the ArrayList:");
            while (iterator.hasNext()) {
                String cuisine = iterator.next();
                System.out.println(cuisine);
            }
        }
    }
