package hwprogrammes;

import java.util.ArrayList;
/*
Write a Java program to retrieve an element (at a specified index) from a given array list
 */

public class Programme_6_RetrieveAnElement {
        public static void main(String[] args) {
            // Create an ArrayList
            ArrayList<String> veggies = new ArrayList<>();
            veggies.add("Carrot");
            veggies.add("Cauli Flower");
            veggies.add("Broccoli");
            veggies.add("Potato");
            veggies.add("Beet Root");

            // Get the element at index 3
            String veggie = veggies.get(3);

            // Print the retrieved element
            System.out.println("Vegetable at index 3: " + veggie);
        }
    }


