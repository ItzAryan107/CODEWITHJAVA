package OOPS;

import java.util.TreeSet;

public class T095_TreeSet {
    public static void main(String[] args) {//this creates list in sorted order
        TreeSet<Integer> treeSet01=new TreeSet<>();
        treeSet01.add(1);
        treeSet01.add(2);
        treeSet01.add(8);
        treeSet01.add(6);
        treeSet01.add(5);
        System.out.println("treeSet01 ---> "+treeSet01);
        TreeSet<Integer>treeSet02=new TreeSet<>();

        System.out.println();

        treeSet02.add(11);
        treeSet02.add(19);
        treeSet02.add(13);
        System.out.println("treeSet02 ---> "+treeSet02);

        System.out.println();

        System.out.println("We can add one tree set to another tree set ---> ");
        treeSet01.addAll(treeSet02);
        System.out.println(treeSet01);

        System.out.println();

        TreeSet<String>treeSet03=new TreeSet<>();
        treeSet03.add("Aryan");
        treeSet03.add("Pallavi");
        treeSet03.add("Arvi");
        System.out.println(treeSet03);//---> we will get this in sorted manner, according to there length
    }
}