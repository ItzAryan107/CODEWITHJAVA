package DataStructureAndAlgorithum.VITAP.LABClasses;

import DataStructureAndAlgorithum.LinkedList.DoubleLinearLinkedList.Node;

public class LC09_DoubleLinkedList<P extends Number> {
    Node<P> head;
    Node<P> tail;
    int length = 0;


    public void insert(P data){
        if (head == null){
            head = new Node<>(data);
            length++;
            tail = head;
            return;
        }

        Node<P> currentNode = head;
        while (currentNode.next!=null){
            currentNode = currentNode.next;
        }

        currentNode.next = new Node<>(data);
        currentNode.next.previous = currentNode;
        tail =  currentNode.next;
        length++;
    }

    public void insertFirst(P data){
        if (head == null){
            head = new Node<>(data);
            length++;
            return;
        }

        Node<P> newNode = new Node<>(data);
        newNode.next = head;
        head.previous = newNode;
        head = newNode;
        length++;
    }

    public void insertAt(int index,P data){
        if (index<0 || index>length)
            throw new IndexOutOfBoundsException();

        if (index == 0){
            insertFirst(data);
            return;
        }

        if (index==length){
            insert(data);
            return;
        }

        Node<P> currentNode = head;
        while (index>=2){
            currentNode = currentNode.next;
            index --;
        }

        Node<P> newNode = new Node<>(data);
        newNode.next =  currentNode.next;
        newNode.previous = currentNode;
        currentNode.next.previous = newNode;
        currentNode.next = newNode;
        length++;

    }

    private void reverse(Node<P> tail){
        if (tail == null) {
            System.out.println("]");
            return;
        }

        if (tail == this.tail)
            System.out.print("[");

        System.out.print(tail.data);

        if (tail.previous!=null)
            System.out.print(" ");

        reverse(tail.previous);
    }

    public void reverse(){
        if (tail == null)
            throw new NullPointerException();

        reverse(tail);
    }

    private void display(Node<P> head){
        if (head == null){
            System.out.println("]");
            return;
        }

        if (head == this.head)
            System.out.print("[");

        System.out.print(head.data);

        if (head.next!=null)
            System.out.print(" ");

        display(head.next);
    }

    public void display(){
        if (head == null)
            throw new NullPointerException();

        display(head);
    }

    public P delete(){
        if (tail == null)
            throw new NullPointerException();
        P deletedData;
        if (tail.previous == null){
            deletedData = tail.data;
            tail = head = null;
            length--;
            return deletedData;
        }
        deletedData = tail.data;
        length--;
        tail.previous.next = null;
        tail = tail.previous;
        return deletedData;
    }

    public P deleteFirst(){
        if (head == null)
            throw new NullPointerException();

        P deletedData;
        if (head.next==null){
            deletedData = head.data;
            tail = head = null;
            length--;
            return deletedData;
        }

        deletedData = head.data;
        head.next.previous=null;
        head = head.next;
        length--;
        return deletedData;
    }

    public P deleteAt(int index){
        if (index<0 || index>length-1)
            throw new NullPointerException();
        P deletedData;
        if (index==0)
            return deleteFirst();

        if (index == length-1)
            return delete();

        Node<P> currentNode = head;
        while (index>=2){

            currentNode = currentNode.next;
            index--;
        }
        deletedData = currentNode.next.data;
        currentNode.next.next.previous=currentNode;
        currentNode.next = currentNode.next.next;
        length--;
        return deletedData;
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
