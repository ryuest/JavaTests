package Arrays; /**
 * Created by jboiko on 08/12/2017.
 */

import java.util.Scanner;

public class Java2DArrayOrig {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int largestSum = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int sum = (arr[i][j]) + (arr[i][j + 1]) + (arr[i][j + 2]) + (arr[i + 1][j + 1]) + (arr[i + 2][j]) + (arr[i + 2][j + 1]) + (arr[i + 2][j + 2]);
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
    }

}
