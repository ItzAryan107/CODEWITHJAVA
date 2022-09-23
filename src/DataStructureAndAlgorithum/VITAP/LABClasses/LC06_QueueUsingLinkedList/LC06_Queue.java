package DataStructureAndAlgorithum.VITAP.LABClasses.LC06_QueueUsingLinkedList;

import java.util.Scanner;

public class LC06_Queue<P> {
    public Node<P> head;
    public P rear;
    Node<P> deQueueNode;
    Scanner sc = new Scanner(System.in);

    public void enQueue(P data){
        if (head == null){
            rear = data;
            head = new Node<>(data);
            return;
        }

        Node<P> newNode = new Node<>(data);
        rear = data;
        newNode.next = head;
        head = newNode;
    }

    private Node<P> deQueue(Node<P> head){
        if (head.next.next == null){
            deQueueNode = head.next;
            head.next = null;
            return deQueueNode;
        }

        return deQueue(head.next);
    }

    public void deQueue(){
        if (head == null) {
            System.out.println("This operation deQueue can't be perform");
            return;
        }

        if (head.next == null) {
            System.out.println("Value deQueued ---> "+head.data);
            head = null;
            return;
        }

        System.out.print("value deQueued ---> ");
        System.out.println(deQueue(head).data);
    }


    public boolean isEmpty(){
        return head==null;
    }

    private void display(Node<P> head){

        if (head == null)
            return;

        display(head.next);
        System.out.print(head.data+" ");
    }

    public void display(){
        if (head == null) {
            System.out.println("Display Operation can't be perform");
            return;
        }

        System.out.print("[");
        if (head.next!=null) {
            display(head.next);
        }
        System.out.println(head.data+"]");
    }

    private P peek(Node<P> head){
        if (head.next == null){
            return head.data;
        }

        return peek(head.next);
    }

    public void peek(){
        if (head == null){
            System.out.println("This operation can't perform peek");
            return;
        }

        System.out.print("peek value ---> ");

        System.out.println(peek(head));
    }

    public P getRear(){
        return rear;
    }

    public void operationsToPerform(){
        System.out.println("\t\tOperations that can be perform");
        System.out.println("1 -enQueue()");
        System.out.println("2 -deQueue()");
        System.out.println("3 -peek()");
        System.out.println("4 -getRear()");
        System.out.println("5 -isEmpty()");
        System.out.println("6 -display()");
        System.out.println("7 -Exit()");
    }

    public void operationToBePerform(){
        if (head == null){
            System.out.println();
            System.out.println("\t\tOperations To Be Perform");
            System.out.println("1 -enQueue()");
            System.out.println("5 -isEmpty()");
            System.out.println("7 -exit()");
            return;
        }
        System.out.println();
        System.out.println("All Operations can be Perform");
    }
}
