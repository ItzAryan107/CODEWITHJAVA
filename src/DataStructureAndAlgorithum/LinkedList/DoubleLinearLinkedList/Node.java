package DataStructureAndAlgorithum.LinkedList.DoubleLinearLinkedList;

public class Node<T> {
    T data;
    Node<T> previous;
    Node<T> next;

    Node(T data){
        this.data = data;
        previous = null;
        next = null;
    }
}
