import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.io.IOException;


/**
 * Created by Zer on 05/12/2017.
 */

interface MyComparator {
    int compare(int a1, int a2);
}

class Printer {
    public static void printArray(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("" + arr[i]);
        }
    }
}

public class PrintOutTest {

    public static void main(String[] args) {

        String max = "Hello";
        System.out.println(Math.pow(4, 4));


        MyComparator myComparator = (a1, a2) -> a1 + a2;
        int result = myComparator.compare(2, 1);
        System.out.println("result = " + result);


        //  System.out.println(max.substring(0, 1) + " " +
        //         max.substring(0) + " " + max.substring(2));

        Printer myPrinter = new Printer();
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if (name.equals("printArray"))
                count++;
        }

        if (count > 1) System.out.println("Method overloading is not allowed!");

    }

}
