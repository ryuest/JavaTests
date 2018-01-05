/**
 * Created by jboiko on 04/01/2018.
 */
public class AbstractMain {

    public static void main(String[] args) {
        tryItOut();
    }

    public static void tryItOut()
    {
        ImplementingClass a = new ImplementingClass();
        AbstractClass b = new ImplementingClass();

        a.abstractMethod();    // prints "abstractMethod()"
        a.implementedMethod(); // prints "Overridden!"     <-- same
        a.finalMethod();       // prints "finalMethod()"
        a.interfaceMethodA();
        a.interfaceMethodB();

        System.out.println();

        b.abstractMethod();    // prints "abstractMethod()"
        b.implementedMethod(); // prints "Overridden!"     <-- same
        b.finalMethod();       // prints "finalMethod()"

        System.out.println();

        SecondImplementingClass c = new SecondImplementingClass();
        AbstractClass d = new SecondImplementingClass();

        c.abstractMethod();    // prints "second abstractMethod()"
        c.implementedMethod(); // prints "implementedMethod()"
        c.finalMethod();       // prints "finalMethod()"

        System.out.println();

        d.abstractMethod();    // prints "second abstractMethod()"
        d.implementedMethod(); // prints "implementedMethod()"
        d.finalMethod();       // prints "finalMethod()"

        System.out.println();


    }
}
