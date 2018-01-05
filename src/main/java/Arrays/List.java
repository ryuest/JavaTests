package Arrays;

/**
 * Created by jboiko on 14/12/2017.
 */

/*
5
12 0 1 78 12
2
Insert
5 23
Delete
0
 */

import java.util.*;

public class List {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.equals("Insert")) {
                int x = sc.nextInt(), y = sc.nextInt();
                list.add(x, y);
            } else {
                int x = sc.nextInt();
                list.remove(x);
            }
        }
        for (Integer aList : list) {
            System.out.print(aList + " ");
        }
    }

}
