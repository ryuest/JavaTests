package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 * Created by jboiko on 11/01/2018.
 */
public class ArrayListToArray {
    public static void main(String[] args) {
        //creating Arraylist
        List<String> fruitList = new ArrayList<>();
        //adding String Objects to fruitsList ArrayList
        fruitList.add("Mango");
        fruitList.add("Banana");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        fruitList.add("Pineapple");
        System.out.println(fruitList);
        System.out.println("Converting ArrayList to Array" );
        String[] item = fruitList.toArray(new String[fruitList.size()]);
        System.out.println(item);
        for(String s : item){
        //    System.out.println(s);
        }
        System.out.println("Converting Array to ArrayList" );
        List<String>l2;
        l2 = Arrays.asList(item);
        System.out.println(l2);
    }
}
