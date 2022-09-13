package DSA.LinkedList.CircularLinkedList;

import java.util.Scanner;

public class CircularLinkedList<T> {

    Scanner sc = new Scanner(System.in);
    Node<T> head;

    public void add(T data){
        Node<T> newNode = new Node<>(data);
        if(head == null){
            head = newNode;
            head.next=head;
            return;
        }

        Node<T> currentNode = head;
        do {
            currentNode = currentNode.next;
        }while (currentNode.next!=head);

        currentNode.next=newNode;
        newNode.next=head;
    }

    public void print(){
        if (head == null)
            return;

        Node<T> currentNode = head;
        System.out.print("[");
        do {
            System.out.print(currentNode.data+" ");
            currentNode=currentNode.next;
        }while (currentNode.next!=head);
        System.out.println(currentNode.data+"]");
    }

    public int size(){
        if (head == null)
            return 0;

        Node<T> currentNode = head;
        int count=0;

        do {
            count++;
            currentNode=currentNode.next;
        }while (currentNode!=head);

        return count;
    }

    public T get(int index){
        if (index == 0)
            return head.data;

        Node<T> currentNode = head;

        while (index!=0) {
            currentNode = currentNode.next;

            if (index == size()){//if the given get gretater than size of circular list, it will ask the valid index to input
                // and it will give the data on modifed index
                System.out.print("Enter The valid Index! ---> ");
                return get(sc.nextInt());
            }

            index = index-1;
        }

        return currentNode.data;
    }

    public int getIndexOF(T data){// if any chance, given data won't present in the given list it will return -1
        int count = -1;
        Node<T> currentNode = head;
        do {
            count++;
            if (currentNode.data == data)
                return count;

            currentNode=currentNode.next;
        }while (currentNode!=head);

        return -1;
    }

//    public static void main(String[] args) {
//        C02_CircularLinkedList<Integer> c02_circularLinkedList = new C02_CircularLinkedList<>();
//        c02_circularLinkedList.add(1);
//        c02_circularLinkedList.add(2);
//        c02_circularLinkedList.add(3);
//        c02_circularLinkedList.add(4);
//        c02_circularLinkedList.add(5);
//        c02_circularLinkedList.add(6);
//        c02_circularLinkedList.print();
//        System.out.println(c02_circularLinkedList.get(6));
////        System.out.println(c02_circularLinkedList.size());
////        System.out.println(c02_circularLinkedList.getIndexOF(87));
//    }
}
