/**
 * Created by jboiko on 07/12/2017.
 */

import java.io.*;
import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String[] a = s.trim().split("[ !,?._'@]+");
        System.out.println(a.length);
        for (String str : a) {
            System.out.println(str);
        }

        scan.close();
    }

}
