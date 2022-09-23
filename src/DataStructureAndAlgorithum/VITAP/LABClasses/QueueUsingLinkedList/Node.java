package DataStructureAndAlgorithum.VITAP.LABClasses.QueueUsingLinkedList;

public class Node<P> {
    public P data;
    public Node<P> next;

    public Node(P data){
        this.data = data;
        next = null;
    }
}
