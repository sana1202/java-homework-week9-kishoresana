package hwprogrammes;

import java.util.Arrays;

/*
Write a Java program to reverse an array of integer values
 */
public class Programme_3_ReverseAnArrayOfInteger {
        public static void main(String[] args) {
            int[] originalArray = {10, 15, 20, 25, 30};
            System.out.println("Original Array: " + Arrays.toString(originalArray));

            reverseArray(originalArray);

            System.out.println("Reversed Array: " + Arrays.toString(originalArray));
        }

        public static void reverseArray(int[] array) {
            int left = 0;
            int right = array.length - 1;

            while (left < right) {
                // Swap elements at left and right indices
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;

                // Move indices toward the center
                left++;
                right--;
            }
        }
    }
