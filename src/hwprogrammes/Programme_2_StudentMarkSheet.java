package hwprogrammes;

import java.util.Scanner;

public class Programme_2_StudentMarkSheet {
    static String name;
    static int roll, math, sci, eng;
    static int total;
    static double percentage;
    static String Grade;
    static String result;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter Student Name      \t \t:\t");
        name = scan.nextLine();
        System.out.print("Enter Student Roll Number \t\t:\t");
        roll = scan.nextInt();
        System.out.print("Enter Marks of Subject Maths \t:\t");
        // while loops ensuring the program does not go forward until incorrect mark values are entered.
        math = scan.nextInt();
        while (math < 0 || math > 100) {
            System.out.println("Invalid Math marks, marks between 0 to 100");
            System.out.println("Please enter correct Math marks: ");
            math = scan.nextInt();
        }
        System.out.print("Enter Marks of Subject Science\t:\t");
        sci = scan.nextInt();
        while (sci < 0 || sci > 100) {
            System.out.println("Invalid Science marks, marks between 0 to 100");
            System.out.println("Please enter correct Science marks: ");
            sci = scan.nextInt();
        }
        System.out.print("Enter Marks of Subject English\t:\t");
        eng = scan.nextInt();
        while (eng < 0 || eng > 100) {
            System.out.println("Invalid English marks, marks between 0 to 100");
            System.out.println("Please enter correct English marks:");
            eng = scan.nextInt();
        }
        // if else statements ensuring all the inserted marks are not out of permitted values
        // if the values are within permitted range it will print result
        // if the values are outside permitted values it will print error message
        if (math >= 0 && math <= 100 && sci >= 0 && sci <= 100 && eng >= 0 && eng <= 100) {
            result1();
            print();
        } else {
            System.out.println("The marks value should be between 0 to 100");
        }
        scan.close();
    }


    // Static method calculating total, percentage & allocating Pass, Fail and Grade using Conditions.
    public static void result1() {
        total = math + eng + sci;
        percentage = (total / 3);
        if ((math < 35) || (sci < 35) || (eng < 35)) {
            percentage = 0.0;
            result = "Fail";
            Grade = "N/A";
        } else if ((percentage >= 35) && percentage < 50) {
            result = "Pass";
            Grade = "C";
        } else if ((percentage >= 50) && percentage < 60) {
            result = "Pass";
            Grade = "B";
        } else if ((percentage >= 60) && (percentage < 80)) {
            result = "Pass";
            Grade = "A";
        } else if (percentage >= 80) {
            result = "Pass";
            Grade = "A++";
        }
    }

    // Print method calling all variables and printing desired output
    public static void print() {
        System.out.println(" ---------------------------------------");
        System.out.println("|              MARK SHEET               |");
        System.out.println("|---------------------------------------|");
        System.out.println("| Name    : " + name + "                         |");
        System.out.println("| Roll No.: " + roll + "                         |");
        System.out.println("|---------------------------------------|");
        System.out.println("| SUBJECTS          :      MARKS        |");
        System.out.println("|---------------------------------------|");
        System.out.println("| Maths             :      " + math + "           | ");
        System.out.println("| Science           :      " + sci + "           | ");
        System.out.println("| English           :      " + eng + "           |");
        System.out.println("|---------------------------------------|");
        System.out.println("| Total             :      " + total + "          | ");
        System.out.println("|---------------------------------------|");
        System.out.println("| Percentage        :      " + percentage +"         |");
        System.out.println("| Result            :      " + result +"         |");
        System.out.println("| Grade             :      " + Grade +"          |");
        System.out.println("|---------------------------------------|");
    }
}
