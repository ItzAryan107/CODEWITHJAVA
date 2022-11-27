package OOPS;

import java.util.HashSet;
import java.util.Set;

public class T095_Set {
    public static void main(String[] args) {
        Set<Integer> set01=new HashSet<>();
        Set<Integer> set02=new HashSet<>();
        set01.add(1);
        set01.add(2);
        set01.add(3);
        set02.add(3);
        set02.add(4);
        set02.add(2);
        set02.add(5);
        System.out.println("set01 ---> "+set01);
        System.out.println("set02 ---> "+set02);

        System.out.println();

        set01.addAll(set02);
        System.out.println("Union ---> "+set01);

        System.out.println();

        set01.retainAll(set02);
        System.out.println("Intersection of two set ---> "+set01);

        System.out.println();

        System.out.println("To check whether the set01 is the subset of set02 or not ---> set01.containsAll(set02)");
        System.out.println(set01.containsAll(set02));//returns true or false
    }
}