package OOPS;

import java.util.HashSet;

public class T095_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet_01=new HashSet<>();//---> 1st Type Constructor
        HashSet<Integer> myHashSet_02=new HashSet<>(6,0.5f);//---> 2nd Type Constructor
        HashSet<String> myHashSet_03=new HashSet<>();//---> 3rd Type Constructor
        myHashSet_01.add(5);
        myHashSet_01.add(6);
        myHashSet_01.add(4);
        myHashSet_01.add(78);
        myHashSet_01.add(78);// if any value will get repeat, it won't get to HashSet
        System.out.println(myHashSet_01);//even this list will get sort in a manner

        System.out.println();

        myHashSet_03.add("Aryan");
        myHashSet_03.add("Pallavi");
        myHashSet_03.add("Arvi");
//        myHashSet_03.add("Arvi");
        System.out.println(myHashSet_03);// ---> String will get arranged in there length order
    }
}