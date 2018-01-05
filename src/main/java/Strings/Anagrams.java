package Strings; /**
 * Created by jboiko on 07/12/2017.
 */

import java.io.*;
import java.util.*;

public class Anagrams {

    static boolean isAnagram(String A, String B) {
        //Complete the function
        if (A.length() != B.length()) {
            return false;
        } else {
            // sort the strings and see if they are equal to be considered an Anagram
            char a[] = A.toLowerCase().toCharArray();
            char b[] = B.toLowerCase().toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            String sortedA = String.valueOf(a);
            String sortedB = String.valueOf(b);
            if (sortedA.equals(sortedB)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = "anagramm"; // Hello
        String b = "marganaa"; // hello
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
