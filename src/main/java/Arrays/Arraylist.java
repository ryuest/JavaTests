package Arrays; /**
 * Created by jboiko on 11/12/2017.
 */

import java.util.*;

public class Arraylist {

    /*
    5
    5 41 77 74 22 44
    1 12
    4 37 34 36 52
    0
    3 20 22 33
    5
    1 3
    3 4
    3 1
    4 3
    5 5
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numLines = Integer.parseInt(sc.nextLine());
        ArrayList<ArrayList> listArray = new ArrayList<ArrayList>();
        for (int i = 0; i < numLines; i++) {
            int numOfIntegers = sc.nextInt();
            ArrayList<Integer> intArrayList = new ArrayList<Integer>();
            for (int j = 0; j < numOfIntegers; j++) {
                intArrayList.add(new Integer(sc.nextInt()));
            }
            listArray.add(intArrayList);
            sc.nextLine();
        }
        int numQueries = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numQueries; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            sc.nextLine();
            if (x < listArray.size() && y < listArray.get(x).size()) {
                System.out.println(listArray.get(x).get(y));
            } else {
                System.out.println("ERROR!");
            }
        }
        sc.close();
    }
}
