package Strings; /**
 * Created by jboiko on 07/12/2017.
 */

import java.io.*;
import java.util.*;

public class StringReverse {

    /*
    Sample Input
    madam

    Sample Output
    Yes
     */

    public static boolean isPalindrome(String word) {
        boolean isPalindrome = true;

        for (int i = 0; i < (int) word.length() / 2; i++) {
            System.out.println("1 " + i);
            System.out.println("2 " + word.charAt(i));
            System.out.println("3 " + word.charAt(word.length() - 1 - i));
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;

            }
        }
        return isPalindrome;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        System.out.println(isPalindrome(A) ? "Yes" : "No");
    }
}
