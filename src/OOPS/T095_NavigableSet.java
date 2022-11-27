package OOPS;

import java.util.NavigableSet;
import java.util.TreeSet;

public class T095_NavigableSet {
    public static void main(String[] args) {
        NavigableSet<String> navigableSet01=new TreeSet<>();
        navigableSet01.add("Aryan");
        navigableSet01.add("Pallavi");
        navigableSet01.add("Arvi");
        System.out.println("It will give ypu the sorted Navigable Set --->");
        System.out.println(navigableSet01);
    }
}
