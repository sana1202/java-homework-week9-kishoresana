package hwprogrammes;

import java.util.ArrayList;
/*
Write a Java program to create a new array list,
add some colours (string) and printout the collection using for each loop
 */

public class Programme_4_NewArrayList {
        public static void main(String[] args) {
            ArrayList<String> colors = new ArrayList<>();

            // Add some colors to the list
            colors.add("Orange");
            colors.add("White");
            colors.add("Green");
            colors.add("Yellow");
            colors.add("Blue");

            // Print the list of colors
            for (String color : colors) {
                System.out.println(color);
            }
        }
    }
