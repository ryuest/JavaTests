package Arrays;

/**
 * Created by jboiko on 13/12/2017.
 */

import java.util.*;
import java.lang.reflect.*;



public class Reflection {

    public static void main(String[] args){
        Class student = new Student3().getClass();
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(Method method:methods){
            methodList.add(method.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }

    static class Student3{
        private String name;
        private String id;
        private String email;
        public String getName() {
            return name;
        }
        public void setId(String id) {
            this.id = id;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public void anothermethod(){  }

    }
}

