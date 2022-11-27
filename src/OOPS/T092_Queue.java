package OOPS;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class T092_Queue {
    public static void main(String[] args) {// Queue is First In First Out(FIFO)
        /**
         * We can make Queue using three classes(as dispatch object)
         * ArrayDeque
         * LinkedList
         * PriorityQueue
         */
        Queue<Integer> Queue01=new ArrayDeque<>();
        Queue<String> Queue02=new LinkedList<>();
        Queue<Float> Queue03=new PriorityQueue<>();

        System.out.println("Adding element to Queue ---> .add() <--- can throw error");// which cam throw exception
        System.out.println("or by ---> .offer() <--- won't throw error");// which will not throw exception
        Queue01.add(1);
        Queue01.add(2);
        Queue01.add(3);
        Queue01.add(4);
        Queue01.add(5);
        Queue01.offer(6);
        System.out.println(Queue01);

        System.out.println();

        System.out.println("It print the head of Queue ---> .element() <--- throw Exception if empty");
        System.out.println("or by ---> .peek() <--- return null if empty");
        System.out.println(".element() ---> "+Queue01.element());
        System.out.println(".peek() ---> "+Queue01.peek());

        System.out.println();

        System.out.println("To remove an element ---> .remove() <--- throw Exception if Queue is Empty");
        System.out.println("or by ---> poll() <--- return null if Queue is Empty");
        Queue01.remove();
        System.out.println(Queue01);
    }
}