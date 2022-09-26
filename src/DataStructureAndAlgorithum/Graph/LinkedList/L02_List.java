package DataStructureAndAlgorithum.Graph.LinkedList;
import DataStructureAndAlgorithum.Graph.LinkedList.L01_Node;
public class L02_List<T> {
    public L01_Node<T> head;
    private int size = 0;

    public void add(T data){

        L01_Node<T> newNode = null;

        if (data != null) {
            newNode = new L01_Node<>(data);
            size++;
        }

        if (head == null){
            head = newNode;
            return;
        }

        L01_Node<T> currentNode = head;

        while (currentNode.next!=null){ // checking for all orther node leaving last
            if (currentNode.data == data)
                return;
            currentNode=currentNode.next;
        }
        if (currentNode.data == data)//checking for the last node
            return;

        currentNode.next = newNode;
    }

    public int size(){
        return size;
    }

    public T get(int index){
        return get(index,head);
    }
    private T get(int index, L01_Node<T> head){
        if (index == 0)
            return head.data;
//        index--;
        return get(--index,head.next);
    }

    public boolean contains(T data){

        L01_Node<T> currentNode = head;
        while (currentNode!=null){
            if (currentNode.data == data)
                return true;
            currentNode=currentNode.next;
        }
        return false;
        
    }

    public boolean isEmpty(){
        return head == null;
    }
}