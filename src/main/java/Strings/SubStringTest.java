package Strings;

import java.util.Scanner;

/**
 * Created by Zer on 04/12/2017.
 */

public class SubStringTest {

    /*
    Helloworld
    3 7

    Sample Output
    lowo
     */

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String S = in.next();
            int start = in.nextInt();
            int end = in.nextInt();
            System.out.println(start+end);
            System.out.println(S.substring(start,end));
            System.out.println();
            System.out.println("Other 'capitalize each word in String' ");
            System.out.print(">>>>>  ");
            String test = "my name is khan";
            System.out.println(capitalizeWord(test));
            System.out.println("<<< >>>");
            String str = "India is my country";
            System.out.println(charRemoveAt(str, 7));
        }

    public static String capitalizeWord(String str){
        String words[]=str.split("\\s");
        String capitalizeWord="";
        for(String w:words){
            String first=w.substring(0,1);
            String afterfirst=w.substring(1);
            capitalizeWord+=first.toUpperCase()+afterfirst+" ";
        }
        return capitalizeWord.trim();
    }

    public static String charRemoveAt(String str, int p) {
        System.out.println("str.substring(0, p) " + str.substring(0, p));
        System.out.println("str.substring(p + 1) "+ str.substring(p + 1));
        return str.substring(0, p) + str.substring(p + 1);
    }

}
