package Strings;

/**
 * Created by jboiko on 09/01/2018.
 */
public class ReverseWithIteration {
    public static String reverseString(String str) {
        char ch[] = str.toCharArray();
        String rev = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            rev += ch[i];
        }
        return rev;
    }

    public static String reverseWord(String str){
        String words[]=str.split("\\s");
        String reverseWord="";
        for(String w:words){
            StringBuilder sb=new StringBuilder(w);
            reverseWord+=reverseString(w)+" ";
        }
        return reverseWord.trim();
    }

    public static void main(String[] args) {
        String test = "this is javatpoint";
        System.out.println(test);
        System.out.println(reverseString(test));
        System.out.println(reverseWord(test));
    }
}
