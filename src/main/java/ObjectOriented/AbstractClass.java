package ObjectOriented;

import java.util.Scanner;

/**
 * Created by Zer on 04/12/2017.
 */
abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class MyBook extends Book {
    void setTitle(String s) {
        this.title = s;
    }
}

public class AbstractClass {

    /*
    A tale of two cities
     */

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        MyBook new_novel=new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: "+new_novel.getTitle());
        sc.close();
    }
}
