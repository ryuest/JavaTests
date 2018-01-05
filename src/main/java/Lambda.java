/**
 * Created by jboiko on 13/12/2017.
 */

import java.io.*;
import java.util.*;
interface PerformOperation {
    boolean check(int a);
}
class MyMath {
    public static boolean checker(PerformOperation p, int num) {

        return p.check(num);
    }

    public static PerformOperation isOdd() {
        return a -> a % 2!=0;
    }

    public static PerformOperation isPrime(){
        return a -> (new java.math.BigInteger(String.valueOf(a))).isProbablePrime(100);
    }

    public static PerformOperation isPalindrome() {
        return a -> String.valueOf(a).equals((new StringBuilder(String.valueOf(a))).reverse().toString());
    }
}

public class Lambda {

    /*
    5
    1 4
    2 5
    3 898
    1 3
    2 12

    Sample Output
    EVEN
    PRIME
    PALINDROME
    ODD
    COMPOSITE
     */

    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T--> 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}
