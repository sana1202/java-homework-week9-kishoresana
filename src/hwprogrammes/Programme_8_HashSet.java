package hwprogrammes;

import java.util.HashSet;

/*
Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if else)
 */
public class Programme_8_HashSet {
        public static void main(String[] args) {
            // Create a HashSet
            HashSet<Integer> numbers = new HashSet<>();

            // Add numbers to the HashSet
            numbers.add(4);
            numbers.add(7);
            numbers.add(8);
//            numbers.add(9); if we provide these as examples then it shows these numbers as well
//            numbers.add(10);
//            numbers.add(1);

            // Check if the numbers between 1 and 10 are in the set
            for (int num = 1; num <= 10; num++) {
                if (numbers.contains(num)) {
                    System.out.println(num + " is in the set.");
                } else {
                    System.out.println(num + " is not in the set.");
                }
            }
        }
    }
