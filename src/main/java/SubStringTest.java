import java.util.Scanner;

/**
 * Created by Zer on 04/12/2017.
 */

public class SubStringTest {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String S = in.next();
            int start = in.nextInt();
            int end = in.nextInt();
            System.out.println(start+end);
            System.out.println(S.substring(start,end));
        }

}
