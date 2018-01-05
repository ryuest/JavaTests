package Strings; /**
 * Created by jboiko on 07/12/2017.
 */

import java.util.*;


public class SubstringComparisons {

    /*
    welcometojava
    3

    Sample Output
    ava
    wel
     */

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        for (int i = 0; i <= (s.length() - k); i++) {
            System.out.println("i "+ s.substring(i) + "  i="+i);
            System.out.println("i+k "+ s.substring(i+k));
            String subString = s.substring(i, i + k);
            System.out.println("subString " + subString);
            if (i == 0) {
                smallest = subString;
      //          System.out.println("smallest 0 " + smallest);
            }
            if (subString.compareTo(largest) > 0) {
                largest = subString;
       //         System.out.println("largest " + largest);
            } else if (subString.compareTo(smallest) < 0)
                smallest = subString;
      //          System.out.println("smallest " + smallest);
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
