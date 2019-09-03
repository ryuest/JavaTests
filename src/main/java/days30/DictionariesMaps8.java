package days30;

import java.util.*;
import java.io.*;

public class DictionariesMaps8 {

        public static void main(String []argh){
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            Map<String, Integer> phonebook = new HashMap<>();
            for(int i = 0; i < n; i++){
                String name = in.next();
                int phone = in.nextInt();
                // Write code here
                phonebook.put(name, phone);

            }
            while(in.hasNext()) {

                String s = in.next();

                if (phonebook.containsKey(s)) {

                    /*
                    // How to get fucking key name and value
                    Set set = phonebook.entrySet();//Converting to Set so that we can traverse
                    Iterator itr = set.iterator();
                    while (itr.hasNext()) {
                        //Converting to Map.Entry so that we can get key and value separately
                        Map.Entry entry = (Map.Entry) itr.next();
                        if (entry.getKey().toString().equalsIgnoreCase(s)) {
                            System.out.println(entry.getKey() + "=" + entry.getValue());

                        }
                    }
                    */
                    System.out.println(s+"="+phonebook.get(s));
                } else {
                    System.out.println("Not found");
                }
            }
                in.close();

        }
    }
