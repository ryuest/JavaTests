/**
 * Created by jboiko on 08/12/2017.
 */

import java.util.Scanner;

class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression =  "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}

public class UsernameRegularExpression {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println(userName + " Valid");
            } else {
                System.out.println(userName + " Invalid");
            }
        }
    }
}
