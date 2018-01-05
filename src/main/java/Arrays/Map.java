package Arrays;

/**
 * Created by jboiko on 13/12/2017.
 */

import java.util.*;
import java.io.*;

public class Map {

    /*
    3
    uncle sam
    99912222
    tom
    11122222
    harry
    12299933
    uncle sam
    uncle tom
    harry
     */

    public static void main(String[] argh) {
        HashMap database = new HashMap();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            database.put(name, "" + phone);
            in.nextLine();
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            String phone = (String) database.get(s);
            System.out.println(phone == null ? "Not found" : s + "=" + phone);
        }
    }
}
