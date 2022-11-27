package OOPS;

import java.util.HashMap;

public class T095_HashMap {
    public static void main(String[] args) {
        HashMap<Integer,String>hashMap01=new HashMap<>();
        System.out.println("Added key and value to HashMap ---> .put(K,V)");
        hashMap01.put(3,"Aryan");
        hashMap01.put(1,"Pallavi");
        hashMap01.put(2,"Arvi");

        System.out.println(hashMap01);// it will not sort the list on the basis of value,
        // instead it will sort on the basis of key

        System.out.println();

        System.out.println("To get a particular value using key ---> .get(K)");
        System.out.println(hashMap01.get(2));

        System.out.println();

        System.out.println("To get all the list of Key ---> .keySet()");
        System.out.println(hashMap01.keySet());

        System.out.println();

        System.out.println("To get the list of values ---> .values()");
        System.out.println(hashMap01.values());

        System.out.println();


    }
}