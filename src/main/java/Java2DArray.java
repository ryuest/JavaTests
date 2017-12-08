/**
 * Created by jboiko on 08/12/2017.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java2DArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] numArray = new String[6][];
        int largestSum = 0;
        for (int i = 0; i < 6; i++) {
            numArray[i] = sc.nextLine().split(" ");
        }

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int sum = Integer.parseInt(numArray[i][j]) + Integer.parseInt(numArray[i][j + 1]) + Integer.parseInt(numArray[i][j + 2]) + Integer.parseInt(numArray[i + 1][j + 1]) + Integer.parseInt(numArray[i + 2][j]) + Integer.parseInt(numArray[i + 2][j + 1]) + Integer.parseInt(numArray[i + 2][j + 2]);
                if (i == 0 && j == 0) {
                    largestSum = sum;
                } else {
                    if (sum > largestSum) {
                        largestSum = sum;
                    }
                }
            }
        }
        System.out.println(largestSum);
        System.out.println(getSumInRaw(0, numArray));
        System.out.println(getSumInRaw(1, numArray));
        System.out.println(getSumInRaw(2, numArray));
        System.out.println(getSumInRaw(3, numArray));
        System.out.println(getSumInRaw(4, numArray));
        System.out.println(getSumInRaw(5, numArray));


    }

    public static int getSumInRaw(int i, String[][] numArray) {
        int sum = Integer.parseInt(numArray[i][0])
                + Integer.parseInt(numArray[i][1])
                + Integer.parseInt(numArray[i][2])
                + Integer.parseInt(numArray[i][3])
                + Integer.parseInt(numArray[i][4])
                + Integer.parseInt(numArray[i][5]);
        return sum;
    }

}
