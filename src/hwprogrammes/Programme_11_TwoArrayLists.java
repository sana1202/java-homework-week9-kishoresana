package hwprogrammes;

import java.util.ArrayList;
/*
Declare following two arrylist and compare it.
ArrayList<String> c1= new ArrayList<String>();
c1.add("Red");
c1.add("Green");
c1.add("Black");
c1.add("White");
c1.add("Pink");
ArrayList<String> c2= new ArrayList<String>();
c2.add("Red");
c2.add("Green");
c2.add("Black");
c2.add("Pink");
 */
public class Programme_11_TwoArrayLists {
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<String>();//Array list c1
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<String>();//Array list c2
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
       // c2.add("White"); if we give this one then it will display as equal
        c2.add("Pink");

        boolean areEqual = c1.equals(c2);

        if (areEqual) {
            System.out.println("The two ArrayLists are equal.");
        } else {
            System.out.println("The two ArrayLists are not equal.");
        }
    }
}
