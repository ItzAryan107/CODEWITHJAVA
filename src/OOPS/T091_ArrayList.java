package OOPS;

import java.util.ArrayList;
import java.util.Scanner;

//Indexing for ArrayList start from zero
public class T091_ArrayList {
    public static void main(String[] args) {
        //ArrayList is a Class in Java.util package
        ArrayList<Integer> L1=new ArrayList<>();//this is the syntax of generic
        ArrayList<String>l2=new ArrayList<>(5);//we can also give the initial capacity of ArrayList,
        // which can be change later on
        // .add() ---> is use to Add the Element in Array
        L1.add(2);
        L1.add(3);
        L1.add(4);
        L1.add(5);
        L1.add(3);
        L1.add(9);
        System.out.println("Print the ArrayList, after adding element to it ---> .add(element)");
        System.out.println(L1);

        System.out.println();

        // .get() is used to get the particular element according to index
        System.out.println("Printing A particular element of ArrList ---> .get(index)");
        System.out.println(L1.get(0));

        System.out.println();

        System.out.println("Printing all Element of ArrayList using for-each loop ---> ");
        for (int i:L1){// using for each loop
            System.out.println(i);
        }

        System.out.println();

        System.out.println("Printing the length of ArrayList ---> .size()");
        System.out.println(L1.size());// .size() is ued to know the length of ArrayList

        System.out.println();

        System.out.println("Removing an element ---> .remove(index)");
        System.out.println(L1.remove(2));

        System.out.println();

        System.out.println("Printing ArrayList After removing an element ---> ");
        System.out.println(L1);
        System.out.println("Print size of ArrayList after removing an element  ---> ");
        System.out.println(L1.size());

        System.out.println();

        System.out.println("Adding element in Between at particular index ---> .add(index,element)");
        L1.add(2,6564);
        System.out.println(L1);
        //again replacing the same element with other
        System.out.println("Adding Another element at same position as above(at index 2) ---> ");
        L1.add(2,95966);
        System.out.println(L1);

        System.out.println();

        System.out.println("Adding element by user to ArrayList<String> ---> ");
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<5;i++){
            System.out.format("Enter %d String ---> ",(i+1));
            l2.add(sc.next());
        }
        System.out.println(l2);

        System.out.println();

        System.out.println("Adding element to Above ArrayList ---> ");//we can even add element to ArrayList,
        // after giving tje initial capacity
        l2.add("Pallavi");
        l2.add("Aryan");
        System.out.println(l2);

        System.out.println();

        System.out.println("You can even remove the particular element ---> .remove(element)");
        l2.remove("Aryan");

        System.out.println();

        //making one more ArrayList to Add in Another ArrayList(data Type should be same)
        ArrayList<Integer> L2=new ArrayList<>(4);
        L2.add(23);
        L2.add(89);
        L2.add(67);
        L2.add(80);
        System.out.println("Adding One ArrayList in between of Another ArrayList ---> L1.addAll(index,Collection)");
        L1.addAll(4,L2);
        System.out.println(L1);

        System.out.println();

        System.out.println("Adding one ArrayList to Another ArrayList ---> .addAll(Collection)");
        L1.addAll(L2);//it will add at the ArrayList at the end of Another ArrayList
        System.out.println(L1);

        System.out.println();

        System.out.println("To know the the given list is empty or not ---> .isEmpty()");
        System.out.println(L1.isEmpty());

        System.out.println();

        System.out.println("If you Want to delete all the element of an ArrayList ---> .clear()");
        l2.clear();
        System.out.println(l2);// <--- cleared ArrayList(Empty ArrayList)

        System.out.println();

        System.out.println("To know A particular element is present in ArrayList or not ---> .contains(element)");//it will give true and false
        System.out.println(L1.contains(3));

        System.out.println();

        System.out.println("To know a particular ArrayList present in Another ArrayList or not ---> .containsAll(Collection)");
        System.out.println(L1.containsAll(L2));

        System.out.println();

        System.out.println("To know the index of a particular element in ArrayList ---> .indexOf(element)");
        System.out.println(L1.indexOf(5));// ---> pehle vale index ko lega, or last index kisi particular
        // element ka chahiye to .lastIndexOf(element); use krte hai

        System.out.println();

        System.out.println("To remove all the element of one ArrayList in another ArrayList ---> .removeAl(Collection)");
        System.out.println("Before removal of L2 from L1 ---> "+L2);
        L2.removeAll(L1);
        System.out.println("After removal of L2 from L1 ---> "+L1);

        System.out.println();

        System.out.println("To replace any element in ArrayList ---> .set(index, element)");
        System.out.println(L1.set(5,437564567));

        System.out.println();

        System.out.println("To know the Index of element if present ---> .indexOf(element)");
        System.out.println(L1.indexOf(3));

        System.out.println();

        System.out.println("if we try to know the element which is not there in ArrayList ---> .indexOf(element)");
        System.out.println(L1.indexOf(374739));// it will give -1
    }
}