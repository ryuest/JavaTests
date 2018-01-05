/**
 * Created by jboiko on 05/01/2018.
 */

abstract class Bike{
    public void run() {
        System.out.println("running not..");
    }
}

class Honda4 extends Bike {
    public void run() {
        System.out.println("run2");
    }
}


public class Test {
    public static void main(String args[]){
        Bike obj = new Honda4();
        obj.run();
    }
}
