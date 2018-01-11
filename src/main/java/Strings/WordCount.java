package Strings;

/**
 * Created by jboiko on 09/01/2018.
 */
public class WordCount {
    static int wordcount(String string)
    {
        int count=0;

        char ch[]= new char[string.length()];
        for(int i=0;i<string.length();i++)
        {
        //    System.out.print("string.charAt(i) >>> "+ string.charAt(i)+ "    >> ");
            ch[i]= string.charAt(i);

            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )

          //      System.out.println("<<< found >>>");
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String string ="    India Is My Country";
        System.out.println(wordcount(string) + " words.");
    }
}
