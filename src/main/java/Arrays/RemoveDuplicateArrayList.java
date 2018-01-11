package Arrays;

/**
 * Created by jboiko on 11/01/2018.
 */
import java.util.*;
import java.util.List;

public class RemoveDuplicateArrayList {

    public static void RemoveDuplicateList (List<String> l) {
        Set<String> s = new LinkedHashSet<String>(l);
        System.out.println(s);
    }

    public static void RemoveManual(List<String> l) {
        Object[] st = l.toArray();
        for (Object s : st) {
            if (l.indexOf(s) != l.lastIndexOf(s)) {
                l.remove(l.lastIndexOf(s));
            }
        }

        System.out.println("Distinct List "+l);
    }

    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();
        l.add("Mango");
        l.add("Mango");
        l.add("Mango");
        l.add("Banana");
        l.add("Mango");
        l.add("Apple");
        l.add("XXX");
        System.out.println(l.toString());
        RemoveDuplicateList(l);
        RemoveManual(l);
    }
}
