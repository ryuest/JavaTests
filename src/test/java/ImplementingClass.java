/**
 * Created by jboiko on 04/01/2018.
 */
public class ImplementingClass extends AbstractClass implements InterfaceA, InterfaceB
{
    public void abstractMethod() { System.out.println("abstractMethod()"); }
    public void implementedMethod() { System.out.println("Overridden!"); }


    @Override
    public void interfaceMethodA() {
        System.out.println("interfaceMethodA");
    }

    @Override
    public void interfaceMethodB() {
        System.out.println("interfaceMethodB");
    }
}