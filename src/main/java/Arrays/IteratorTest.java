package Arrays; /**
 * Created by jboiko on 05/12/2017.
 */

import java.util.*;

public class IteratorTest {
    static Iterator func(ArrayList mylist) {
        Iterator it = mylist.iterator();
        while (it.hasNext()) {
            Object element = it.next();
            if (!element.toString().matches("###")) {
                it.remove();//Hints: use instanceof operator
            } else {
                it.remove();
                break;
            }
        }
        return it;

    }

    @SuppressWarnings({"unchecked"})
    public static void main(String[] args) {
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            mylist.add(sc.nextInt());
        }

        mylist.add("###");
        for (int i = 0; i < m; i++) {
            mylist.add(sc.next());
        }
        System.out.println("<----My List---->");
        System.out.println(mylist);
        System.out.println("<----My List---->");
        Iterator it = func(mylist);
        while (it.hasNext()) {
            Object element = it.next();
            System.out.println(element);
        }
    }

}
