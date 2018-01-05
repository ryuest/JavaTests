package Arrays;

/**
 * Created by jboiko on 05/01/2018.
 */

import java.util.*;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BigIntegerTest {

    /*
    Output two lines. The first line should contain , and the second line should contain . Don't print any leading zeros.
    1234+20=1254
    1234X20=24680

    1234
    20
     */

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        BigInteger a;
        BigInteger b;
        BigInteger sum = BigInteger.valueOf(0);
        BigInteger product = BigInteger.valueOf(0);

        a = new BigInteger(userInput.nextLine());
        b = new BigInteger(userInput.nextLine());

        sum = sum.add(a);
        sum = sum.add(b);
        product = a.multiply(b);

        System.out.println(sum);
        System.out.println(product);
    }
}
