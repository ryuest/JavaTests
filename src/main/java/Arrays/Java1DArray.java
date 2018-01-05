package Arrays; /**
 * Created by jboiko on 11/12/2017.
 */

import java.util.*;

public class Java1DArray {

    /*
    5
    10
    20
    30
    40
    50
    */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            int val = scan.nextInt();
            a[i] = val;
        }
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}
