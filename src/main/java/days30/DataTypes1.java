package days30;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataTypes1 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int one = 0;
        double two = 0.0;
        String inputString = "";

        if (scan.hasNextLine()) {
            try {
                one = scan.nextInt();
                two = scan.nextDouble();
                inputString = scan.nextLine().toString();
            } catch (InputMismatchException e) {

            }
        }

        System.out.println(i + one);
        System.out.println(d + two);
        System.out.println(inputString + s);
        /* Declare second integer, double, and String variables. */

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */

        scan.close();

    }
}
