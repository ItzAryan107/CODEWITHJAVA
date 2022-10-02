package DataStructureAndAlgorithum.LinkedList.DoubleLinearLinkedList;

public class Node<T> {
    public T data;
    public Node<T> previous;
    public Node<T> next;

    public Node(T data){
        this.data = data;
        previous = null;
        next = null;
    }
}
