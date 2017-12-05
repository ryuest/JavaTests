/**
 * Created by jboiko on 05/12/2017.
 */
import java.math.BigDecimal;
import java.util.*;

public class BigDecimalTest {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        List<String> list = new ArrayList<String>();

        for (int i = 0; i < n; i++) {
            //     System.out.println(s[i]);
            list.add(s[i]);
        }

        System.out.println(list);

        String[] simpleArray = new String[list.size()];
        for (int i = 0; i < n; i++) {
            //     System.out.println(s[i]);
            simpleArray[i] = list.get(i);
        }

        Arrays.sort(simpleArray, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.valueOf(o1).compareTo(Integer.valueOf(o2));
            }
        });

        System.out.println(simpleArray[0] + " " + simpleArray[1] +" "+simpleArray[2] + " " + simpleArray[3]);
    }






    /*
    public static void sortSSS(String [] s) {

    //    String s[] = {"10", "2", "1"};
        Collections.sort(Arrays.asList(Arrays.toString(s)), new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                int i = Integer.parseInt(o1);
                int i2 = Integer.parseInt(o2);
                if (i > i2)
                    return 1;
                else if (i < i2)
                    return -1;
                else
                    return 0;
            }
        });
        System.out.println(Arrays.toString(s));

    }

    */

}

