package OOPS;

import java.util.ArrayDeque;

public class T093_ArrayDequeue {//Double Ended Queue
    // where we can do deletion and insertion from both end, by using addFirst(),  addLast(), removeFirst(), removeLast()
    //its First In First Out
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1=new ArrayDeque<>();
        ad1.add(7);
        ad1.add(5);
        ad1.add(6);
        ad1.add(9);
        ad1.add(3);
        System.out.println("ArrayDequeue After adding some element ---> .add(element)");
        System.out.println(ad1);

        System.out.println();

        System.out.println("To get First element of ArrayDequeue ---> .getFirst()");
        System.out.println(ad1.getFirst());

        System.out.println();

        System.out.println("To get Last element of ArrayDequeue ---> .getLast()");
        System.out.println(ad1.getLast());

        System.out.println();

        System.out.println("To add element in Starting ---> .addFirst(element)");
        ad1.addFirst(45);
        System.out.println(ad1);

        System.out.println();

        System.out.println("To add element in Last ---> .addLast(element)");
        ad1.addLast(76);
        System.out.println(ad1);

        System.out.println();

        //almost all method same to ArrayList
        System.out.println("Removing Element from Dequeue(First In First Out) Like Open Container---> .remove()");
        ad1.remove();
        System.out.println(ad1);

        System.out.println();

        ArrayDeque<Integer> ad2=new ArrayDeque<>(4);
        ad2.add(1);
        ad2.add(2);
        ad2.add(3);
        ad2.add(4);
        System.out.println("It will Add in first but will not throw Exception ---> .offerFirst()");
        ad2.offerFirst(90);
        System.out.println(ad2);


        System.out.println();

        System.out.println("To return a copy of a Dequeue ---> .clone()");
        System.out.println(ad2.clone());

        System.out.println();

        System.out.println("Cloning one ArrayDeque in Another ArrayDequeue");
        ArrayDeque<Integer> ad3= ad2.clone();
        System.out.println("ad2 ---> "+ad2);
        System.out.println("ad3 ---> "+ad3);
    }
}