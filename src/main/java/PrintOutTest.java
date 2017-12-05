/**
 * Created by Zer on 05/12/2017.
 */
public class PrintOutTest {

    public static void main(String[] args) {
        // o1.getCgpa() > o2.getCgpa() ? -1 : (o1.getId() < o2.getId()) ? 1 : 0;

        int a = 2;
        int b = 1;
        int max = 0;

        if (a > b) {
            max = a;
        }
        else {
            max = b;
        }

        max = (a < b) ? a : b;

        System.out.println(max);
    }
}
