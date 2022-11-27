package OOPS;

import java.util.Comparator;
import java.util.PriorityQueue;

public class T093_PriorityQueue {//Comparator is Interface which come under PriorityQueue
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue01=new PriorityQueue<>();
//        CustomComparator customComparator=new CustomComparator();
//        PriorityQueue<Integer> priorityQueue01=new PriorityQueue<>(customComparator);
        System.out.println("Adding element to PriorityQueue ---> .add(element) <--- can throw Exception if Queue is full");
        System.out.println("or by ---> .offer(element) return false if queue is full");
        priorityQueue01.add(1);
        priorityQueue01.add(33);
        priorityQueue01.add(3);
        priorityQueue01.offer(5);
        priorityQueue01.offer(4);
        System.out.println(priorityQueue01);

        System.out.println();

        System.out.println("To search an element is it present or not ---> .contains(element) <--- returns true or false");
        System.out.println(priorityQueue01.contains(5));

        System.out.println();

        System.out.println("To know the Size of Queue ---> .size()");
        System.out.println(priorityQueue01.size());

        System.out.println();

        System.out.println("To convert this PriorityQueue in Array ---> .toArray()");
        Object[] s=priorityQueue01.toArray();
        System.out.println("An element of Created Array ---> "+s[3]);

    }
}
class CustomComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {// this method is already there in comparator interface
        int value=o1.compareTo(o2);
        if(value>0){
            return -1;
        }
        else if (value<0)
            return 1;
        else
            return 0;
    }
}