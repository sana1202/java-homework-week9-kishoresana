package hwprogrammes;

import java.util.ArrayList;
/*
Write a Java program to test if an array list is empty or not
 */
public class Programme_7_ArrayListIsEmpty {
        public static void main(String[] args) {
            // Create an ArrayList
            ArrayList<String> fruits = new ArrayList<>();
            //fruits.add("Apple"); if we provide list and run then it shows as not empty message
            // Check if the ArrayList is empty
            if (fruits.isEmpty()) {
                System.out.println("The ArrayList is empty.");
            } else {
                System.out.println("The ArrayList is not empty.");
            }
        }
    }
