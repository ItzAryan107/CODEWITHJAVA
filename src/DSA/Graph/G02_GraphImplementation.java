package DSA.Graph;

import DSA.Graph.LinkedList.L01_Node;

public class G02_GraphImplementation<T> {

    G01_Node<T> head;

    public void addEdges(T data, T listData){
        G01_Node<T> newNode = new G01_Node<>(data);
        if (head == null){
            head = newNode;
            head.list.add(listData);
            head.next=head;
            return;
        }

        G01_Node<T> currentNode = head;
        G01_Node<T> previousNode;
        do {
            previousNode = currentNode;
            if (currentNode.data == data){
                currentNode.list.add(listData);
                return;
            }
            currentNode=currentNode.next;
        }while (currentNode!=head);

        newNode.list.add(listData);
        previousNode.next=newNode;
        newNode.next=head;
    }

    public int size(){
        return size(1,head);
    }

    private int size(int count, G01_Node<T> head){
        if (head == null)
            return 0;
        if(head.next.data == this.head.data){
            return count;
        }

        return size(count+1,head.next);
    }

    public void addUnDirectedEdges(T data, T listData){
        addEdges(data,listData);
        addEdges(listData,data);
    }

    public void printGraph(){
        printGraph(head);
    }
    private void printGraph(G01_Node<T> root){

        System.out.print(root.data+" -> [");
        L01_Node<T> currentNode = root.list.head;

        if (currentNode!=null) {
            while (currentNode.next != null) {
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.next;
            }

            System.out.println(currentNode.data+"]");
        }
        else {
            System.out.println("]");
        }

        if (root.next == head)
            return;

        printGraph(root.next);
    }

    public boolean isContain(T data){

        G01_Node<T> currentNode =head;
        do {

            if (data == currentNode.data)
                return true;

            currentNode=currentNode.next;
        }while (currentNode!=head);

        return false;
    }
}