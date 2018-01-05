/**
 * Created by jboiko on 04/01/2018.
 */
abstract public class AbstractClass
{
    abstract public void abstractMethod();
    public void implementedMethod() { System.out.println("implementedMethod()"); }
    final public void finalMethod() { System.out.println("finalMethod()"); }
}
