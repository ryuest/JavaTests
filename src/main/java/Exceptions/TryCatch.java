package Exceptions;

/**
 * Created by jboiko on 13/12/2017.
 **/

import java.util.*;

public class TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            try {
                int x = sc.nextInt();
                int y = sc.nextInt();
                System.out.println("" + (x / y));
            } catch (InputMismatchException e) {
                System.out.println("java.util.InputMismatchException");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
