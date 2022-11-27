package OOPS;

import java.util.ArrayList;
import java.util.LinkedList;

public class T092_LinkedList {
    public static void main(String[] args) {
        //internal working of LinkedList is different from ArrayList, and Some Additional methods LinkedList Have
        LinkedList<Integer> L1=new LinkedList<>();//initial capacity is not allowed to give in LinkedList
        L1.add(2);
        L1.add(3);
        L1.add(4);
        L1.add(5);
        L1.add(3);
        L1.add(9);
        System.out.println("Print the LinkedList, after adding element to it ---> .add(element)");
        System.out.println(L1);

        System.out.println();

        System.out.println("This is Used to add element in the last of LinkedList ---> .addLast(element)");
        L1.addLast(3);
        System.out.println(L1);
        System.out.println("This is used to add element in the starting of LinkedList ---> .addFirst(element)");
        L1.addFirst(78);
        System.out.println(L1);

        System.out.println();

        System.out.println("To remove Last Element ---> .removeLast()");
        L1.removeFirst();
        System.out.println(L1);
        System.out.println("To remove first element ---> .removeFirst()");
        L1.removeLast();
        System.out.println(L1);

        System.out.println();

        System.out.println("To remove Particular indexed element ---> .remove(index)");
        L1.remove(3);
        System.out.println(L1);

        System.out.println();

        //almost all method of ArrayList is applicable here

    }
}