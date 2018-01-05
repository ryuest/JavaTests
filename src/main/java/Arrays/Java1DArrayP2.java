package Arrays; /**
 * Created by jboiko on 11/12/2017.
 */

import java.util.*;

public class Java1DArrayP2 {

    public static boolean canWin(int[] gameArray, int jumpLength, int currentPos, int lastJumpPos) {
        boolean didWin = false;

        int range = currentPos;

        while (range < gameArray.length - 1 && gameArray[range + 1] == 0) {
            range++;
        }
        if (range == gameArray.length - 1) return true;

        int lowRange = range;
        while (lowRange > lastJumpPos && gameArray[lowRange - 1] == 0 && (lowRange + jumpLength) > range + 1) {
            lowRange--;
        }
        currentPos = lowRange;
        for (int i = currentPos; i <= range; i++) {
            if ((i + jumpLength) < gameArray.length && gameArray[i + jumpLength] == 0 && jumpLength != 0) {
                didWin = canWin(gameArray, jumpLength, i + jumpLength, i);
            }

            if (didWin || (i + jumpLength) >= gameArray.length || (i + 1) >= gameArray.length) {
                didWin = true;
                break;
            }
        }

        return didWin;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(game, leap, 0, 0)) ? "YES" : "NO");
        }
        scan.close();
    }
}
