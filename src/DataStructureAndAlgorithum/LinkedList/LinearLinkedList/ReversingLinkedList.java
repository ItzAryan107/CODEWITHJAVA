package DataStructureAndAlgorithum.LinkedList.LinearLinkedList;

public class ReversingLinkedList<P> {

    public Node<P> reverse(Node<P> head){
        if (head == null)
            throw new NullPointerException();

        if (head.next==null)
            return head;
        Node<P> temp = head.next;
        head.next=null;
        return reverse(temp,head);
    }

    public Node<P> reverse(Node<P> head, Node<P> previousNode){
        Node<P> temp = head.next;
        if (head.next == null){
            head.next = previousNode;
            return head;
        }
        head.next = previousNode;
        return reverse(temp,head);
    }


    public static void main(String[] args) {
        LinearLinkedList<Integer> linkedList = new LinearLinkedList<>();
        ReversingLinkedList<Integer> reversingLinkedList = new ReversingLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.print();
        linkedList.head = reversingLinkedList.reverse(linkedList.head);
        linkedList.print();

    }
}
