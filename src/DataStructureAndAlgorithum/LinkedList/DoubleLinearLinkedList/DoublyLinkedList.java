package DataStructureAndAlgorithum.LinkedList.DoubleLinearLinkedList;

public class DoublyLinkedList<T> {

    Node<T> head;
    Node<T> foot;

    public void append(T data){ // adds data at the end of the list
        Node<T> newNode = new Node<>(data);
        if (head == null){
            head = newNode;
            foot = newNode;
            return;
        }

        Node<T> currentNode = head;

        while (currentNode.next!=null){
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
        newNode.previous = currentNode;
        foot = newNode;
    }

    public void add(T data){ // adds at the starting of the head
        Node<T> newNode = new Node<>(data);

        if (head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head.previous = newNode;

        head = newNode;
    }

    public void print(){ // print the data from head to foot
        Node<T> currentNode = head;

        System.out.print("[");
        while (currentNode.next!=null){
            System.out.print(currentNode.data+" ");
            currentNode = currentNode.next;
        }
        System.out.println(currentNode.data+"]");
    }

    public void printReverse(){
        Node<T> currentNode = foot;

        System.out.print("[");
        while (currentNode.previous!=null){
            System.out.print(currentNode.data+" ");
            currentNode = currentNode.previous;
        }
        System.out.println(currentNode.data+"]");
    }

    public static void main(String[] args) {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();

        doublyLinkedList.append(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.add(50);
        doublyLinkedList.append(4);

        doublyLinkedList.print();
        doublyLinkedList.printReverse();
    }
}
