package ObjectOriented;

import java.util.Scanner;

/**
 * Created by Zer on 04/12/2017.
 */
class MyCalculator implements AdvancedArithmetic {

    /*
    6

    I implemented: AdvancedArithmetic
    12
     */
    public int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(n % i);
            System.out.println(n % i == 0);
            if (n % i == 0)
                sum=sum+i;
        }
        return sum;
    }
}

class InterfaceTest {

    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }

}
