package OOPS;

import java.util.ArrayList;

public class T091_ArrayListAnyDataType {
    public static void main(String[] args) {
        ArrayList name=new ArrayList(3);
        name.add(23);
        name.add(65);
        name.add("Aryan");
        name.add(7.49);
        System.out.println(name);
    }
}