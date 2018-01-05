package Arrays; /**
 * Created by jboiko on 05/12/2017.
 */
import java.math.BigDecimal;
import java.util.*;

public class BigDecimalTest {

    /*
    9
    -100
    50
    0
    56.6
    90
    0.12
    .12
    02.34
    000.000
     */

    public static void main(String []args){
        //Input
        Scanner userInput = new Scanner(System.in);
        int arraySize = Integer.parseInt(userInput.nextLine());
        String [] array = new String[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = userInput.nextLine();
        }

        for (int i = 0; i < (array.length - 1); i++) {
            for (int k = (i + 1); k < array.length; k++) {
                if (new BigDecimal(array[i]).compareTo(new BigDecimal(array[k])) < 0) {
                    String tempValue = array[i];
                    array[i] = array[k];
                    array[k] = tempValue;
                }
            }
        }

//Output
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}

