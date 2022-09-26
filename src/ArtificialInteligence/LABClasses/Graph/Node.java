package ArtificialInteligence.LABClasses.Graph;

import ArtificialInteligence.LABClasses.HASHMAP.HashMap;
import java.util.PriorityQueue;

public class Node<A> {
    public A data;
    public HashMap<A, Integer> hashSet;
    public PriorityQueue<Integer> priorityList;
    public Node<A> next;

    public Node(A data){
        this.data = data;
        hashSet = new HashMap<>();
        priorityList = new PriorityQueue<>();
        next = null;
    }
}
