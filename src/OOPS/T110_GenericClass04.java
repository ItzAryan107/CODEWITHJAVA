package OOPS;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class T110_GenericClass04 {
    public static void main(String[] args) {
        Map<Integer,String>map=new HashMap<>();
        map.put(1,"Aryan");
        map.put(2,"Pallavi");
        map.put(3,"Arvi");
        System.out.println(map);

        Map<Character,String>map01=new HashMap<>();
        map01.put('a',"Aryan");
        map01.put('b',"Pallavi");
        System.out.println(map01);

        Set<Map.Entry<Integer,String>>set=map.entrySet();//linking map to Set
        Iterator<Map.Entry<Integer,String>>iterator= set.iterator();// linking map for iterator
        while (iterator.hasNext()){
            Map.Entry e=iterator.next();
            System.out.println(e.getKey()+" ---> "+e.getValue());
        }
    }
}