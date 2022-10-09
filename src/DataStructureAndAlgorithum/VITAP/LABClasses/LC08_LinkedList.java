package DataStructureAndAlgorithum.VITAP.LABClasses;

import DataStructureAndAlgorithum.VITAP.LABClasses.LC06_QueueUsingLinkedList.Node;

public class LC08_LinkedList<P extends Number> {

    Node<P> head;
    int length;

    LC08_LinkedList(){
        length = 0;
        head = null;
    }

    public void insertion(P data){//inserting at last
        if (head == null){
            head = new Node<>(data);
            length++;
            return;
        }

        Node<P> currentNode = head;
        while (currentNode.next!=null){
            currentNode = currentNode.next;
        }

        currentNode.next = new Node<>(data);
        length++;
    }

    public void insertFirst(P data){//insert at first
        if (head == null){
            head = new Node<>(data);
            length++;
            return;
        }

        Node<P> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void insertAt(int index, P data){//inserting at a position
        if (index>length && index<0)
            throw new NullPointerException();

        if (index == 0){
            insertFirst(data);
            return;
        }

        if (index == length){
            insertion(data);
            return;
        }

        Node<P> currentNode = head;
        while (index>=2){
            currentNode = currentNode.next;
            index --;
        }

        Node<P> newNode = new Node<>(data);
        newNode.next = currentNode.next;
        currentNode.next = newNode;
        length++;
    }

    public P deletion(){
        if (head == null)
            throw new NullPointerException();

        Node<P> currentNode = head;
        Node<P> previousNode = null;
        while (currentNode.next!=null){
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        P deletedData = currentNode.data;

        assert previousNode != null;
        previousNode.next = null;
        length--;

        return deletedData;
    }

    public P deleteFirst(){
        if (head == null)
            throw new NullPointerException();
        P deletedData = head.data;
        length --;
        head = head.next;

        return deletedData;
    }

    public P deleteAt(int index){
        if (head == null || index<0 || index>length-1)
            throw new NullPointerException();

        if (index == 0)
            return deleteFirst();

        if (index == length-1)
            return deletion();

        Node<P> currentNode = head;
        while (index>=2){

            currentNode = currentNode.next;
            index--;
        }
        P deletedData = currentNode.next.data;
        currentNode.next = currentNode.next.next;
        length--;
        return deletedData;
    }

    public void display (){
        if (head == null)
            throw new NullPointerException();

        Node<P> currentNode = head;
        System.out.print("[");
        while (currentNode.next!=null){
            System.out.print(currentNode.data+" ");
            currentNode = currentNode.next;
        }
        System.out.println(currentNode.data+"]");
    }

    private void displayReverse(Node<P> head){
        if (head == null) {
            System.out.print("[");
            return;
        }

        displayReverse(head.next);
        System.out.print(head.data+" ");
    }

    public void reverse(){
        if (head == null)
            throw new NullPointerException();

        displayReverse(head);
        System.out.println("]");
    }

    public P get(int index){
        if (head == null || index<0 || index>length-1)
            throw new NullPointerException();

        if (index == 0)
            return head.data;

        if (index == 1)
            return head.next.data;

        Node<P> currentNode = head;
        while (index>=1){
            currentNode = currentNode.next;
            index--;
        }

        return currentNode.data;
    }

    private boolean search(Node<P> head, P data){
        if (head == null)
            return false;

        if (head.data.equals(data))
            return true;

        return search(head.next,data);
    }

    public boolean search(P data){
        if (head == null)
            throw new NullPointerException();

        return search(head,data);
    }

    public void sort(){
        Node<P> currentNode = head;
        while (currentNode.next!=null){
            Node<P> tempNode = currentNode.next;
            while (tempNode!=null){
                if (tempNode.data.doubleValue()<currentNode.data.doubleValue()){
                    P tempData = tempNode.data;
                    tempNode.data = currentNode.data;
                    currentNode.data = tempData;
                }
                tempNode = tempNode.next;
            }
            currentNode = currentNode.next;
        }
    }
}
