package days30;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LetsReview6 {

    public static void main(String[] args) {
        //    String myString = "Rank";

        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        String myString;

        for (int i = 0; i < T; i++) {
            myString = scan.next();

            for (int j = 0; j < myString.length(); j++) {

                if (j % 2 == 0) {
                    System.out.print(myString.charAt(j));
                }
            }
            System.out.print(" ");
            for (int j = 0; j < myString.length(); j++) {
                if (j % 2 == 1) {
                    System.out.print(myString.charAt(j));
                }

            }
            System.out.println();
        }
    }

}
