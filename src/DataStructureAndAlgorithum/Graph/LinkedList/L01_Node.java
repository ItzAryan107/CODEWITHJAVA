package DataStructureAndAlgorithum.Graph.LinkedList;

public class L01_Node<T> {
    public T data;
    public DataStructureAndAlgorithum.Graph.LinkedList.L01_Node<T> next;

    public L01_Node(T data){
        this.data=data;
        next = null;
    }
}
