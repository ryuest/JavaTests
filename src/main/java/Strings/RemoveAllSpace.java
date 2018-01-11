package Strings;

/**
 * Created by jboiko on 09/01/2018.
 */
public class RemoveAllSpace {

    public static void main(String[] args) {
        String str = "India     Is My    Country";

        //2nd way
        char[] strArray = str.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < strArray.length; i++) {
            if ((strArray[i] != ' ') && (strArray[i] != '\t')) {
                stringBuffer.append(strArray[i]);
            }
        }
        String noSpaceStr2 = stringBuffer.toString();
        System.out.println(noSpaceStr2);
    }

}


