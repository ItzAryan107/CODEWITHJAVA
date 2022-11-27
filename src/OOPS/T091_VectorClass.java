package OOPS;

import java.util.Vector;

public class T091_VectorClass {
    public static void main(String[] args) {
        Vector<String> vec=new Vector<>(4);//default capacity of Vector is 10
        System.out.println("To know the initial capacity ---> .capacity()");
        System.out.println(vec.capacity());

        System.out.println();

        vec.add("Aryan");
        System.out.println("To get element of a Vector List ---> .get(index)");
        System.out.println(vec.get(0));
        vec.add("Pallavi");
        vec.add("Arvi");
        vec.add("Manoj");

        System.out.println();

        System.out.println("Checking Capacity ---> .capacity()");
        System.out.println(vec.capacity());
        System.out.println("Size ---> .size()");
        System.out.println(vec.size());

        System.out.println();

        System.out.println("To know the hashCode of vector ---> .hashCode()");
        System.out.println(vec.hashCode());

        System.out.println();
    }
}