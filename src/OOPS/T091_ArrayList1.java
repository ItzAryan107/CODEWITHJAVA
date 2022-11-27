package OOPS;

import java.util.ArrayList;
import java.util.Iterator;

public class T091_ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Aryan");
        arrayList.add("Ashmit");
        arrayList.add("Manoj");
        arrayList.add("Dharamendra");
        arrayList.add("Ramraksha");
        System.out.println(arrayList.get(0));
        System.out.println(arrayList);
        Iterator<String> iterator=arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();

        System.out.println("Copying one ArrayList in another ArrayList ---> .clone()");
        ArrayList<String> arrayList1= (ArrayList<String>) arrayList.clone();
        System.out.println("Copied ArrayList1 in ArrayList ---> "+arrayList1);
    }
}
