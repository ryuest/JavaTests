package Strings; /**
 * Created by jboiko on 07/12/2017.
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {

    public static void main(String[] args) {

        /*
        5
    Goodbye bye bye world world world
    Sam went went to to to his business
    Reya is is the the best player in eye eye game
    in inthe
    Hello hello Ab aB
    Sample Output

    Goodbye bye world
    Sam went to his business
    Reya is the best player in eye game
    in inthe
    Hello Ab
         */

        String regex = "(?i)\\b(\\w+)(\\s+\\1)+\\b";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);
            System.out.println("m " + m);
            System.out.println(input.replaceAll(regex, "ZZZ"));

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(regex,"$1");
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }

}
