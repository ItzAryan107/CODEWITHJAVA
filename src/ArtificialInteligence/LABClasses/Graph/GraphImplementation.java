package ArtificialInteligence.LABClasses.Graph;

import ArtificialInteligence.LABClasses.HASHMAP.HashMapNode;

public class GraphImplementation<A> {

    private Node<A> head;

    public void addEdge(A data, A connectedNodes, Integer pathCost) {

        if (head == null){
            head = new Node<>(data);
            head.hashSet.put(connectedNodes,pathCost);
            head.priorityList.add(pathCost);

            head.next=head;
            return;
        }

        Node<A> currentNode = head;
        Node<A> previousNode;

        do {

            if (currentNode.data == data){
                if (!currentNode.hashSet.containsKey(connectedNodes)) {
                    currentNode.priorityList.add(pathCost);
                }

                currentNode.hashSet.put(connectedNodes,pathCost);

                return;
            }
            previousNode = currentNode;
            currentNode = currentNode.next;

        }while (currentNode!=head);


        previousNode.next=new Node<>(data);
        previousNode.next.hashSet.put(connectedNodes,pathCost);
        previousNode.next.priorityList.add(pathCost);
        previousNode.next.next = head;

    }

    public void addUndirectedEdge(A data, A connectedNodes, Integer pathCost){
        addEdge(data,connectedNodes,pathCost);
        addEdge(connectedNodes,data,pathCost);
    }

    private void printGraph(Node<A> head){
        if (head == null)
            return;

        System.out.print(head.data+"-> ");
        head.hashSet.print();

        if (head.next == this.head)
            return;

        printGraph(head.next);
    }

    public void printGraph(){
        printGraph(head);
    }

    public Node<CoordinateNode<A>> coordinateHead;
    public void addCoordinateEdge(CoordinateNode<A> a1, CoordinateNode<A> a2, Integer pathCost){
        if (coordinateHead == null){
            coordinateHead = new Node<>(a1);
            coordinateHead.hashSet.put(a2,pathCost);
            coordinateHead.priorityList.add(pathCost);

            coordinateHead.next=coordinateHead;
            return;
        }

        Node<CoordinateNode<A>> currentNode = coordinateHead;
        Node<CoordinateNode<A>> previousNode;

        do {
            previousNode = currentNode;
            if (currentNode.data.x == a1.x && currentNode.data.y == a1.y){

                HashMapNode<CoordinateNode<A>, Integer> hashMapCurrentNode = currentNode.hashSet.head;
                HashMapNode<CoordinateNode<A>,Integer> hashMapPreviousNode = null;


                while (hashMapCurrentNode!=null){
                    hashMapPreviousNode=hashMapCurrentNode;
                    if (hashMapCurrentNode.key.x == a2.x && hashMapCurrentNode.key.y == a2.y){
                        return;
                    }
                    hashMapCurrentNode = hashMapCurrentNode.next;
                }
                assert hashMapPreviousNode != null;
                hashMapPreviousNode.next=new HashMapNode<>(a2,pathCost);
                currentNode.priorityList.add(pathCost);
                return;
            }
            currentNode = currentNode.next;
        }while (currentNode!=coordinateHead);

        previousNode.next = new Node<>(a1);
        previousNode.next.hashSet.put(a2,pathCost);
        previousNode.next.priorityList.add(pathCost);
        previousNode.next.next=coordinateHead;

    }

    public void addCoordinateDirectedEdge(A x1,A y1, A x2, A y2, Integer pathCost){
        CoordinateNode<A> a1=new CoordinateNode<>(x1,y1);
        CoordinateNode<A> a2=new CoordinateNode<>(x2,y2);

        addCoordinateEdge(a1,a2,pathCost);
    }
    public void addCoordinateUnDirectedEdge(A x1,A y1, A x2, A y2, Integer pathCost){
        CoordinateNode<A> a1=new CoordinateNode<>(x1,y1);
        CoordinateNode<A> a2=new CoordinateNode<>(x2,y2);

        addCoordinateEdge(a1,a2,pathCost);
        addCoordinateEdge(a2,a1,pathCost);
    }


    private void printCoordinateGraph(Node<CoordinateNode<A>> head){
        if (head == null)
            return;

        System.out.print("("+head.data.x+","+head.data.y+")-> ");

        HashMapNode<CoordinateNode<A>,Integer> currentNode = head.hashSet.head;
        System.out.print("{");
        if (currentNode!=null) {
            while (currentNode.next != null) {
                System.out.print("(" + currentNode.key.x + "," + currentNode.key.y + ")"+"="+currentNode.value+", ");
                currentNode = currentNode.next;
            }
            System.out.print("(" + currentNode.key.x + "," + currentNode.key.y + ")"+"="+currentNode.value);
        }

        System.out.println("}");

        if (head.next == coordinateHead)
            return;

        printCoordinateGraph(head.next);
    }


    public void printCoordinateGraph(){
        printCoordinateGraph(coordinateHead);
    }



    public static void main(String[] args) {
//        GraphImplementation<Integer> graphImplementation = new GraphImplementation<>();
//
//        graphImplementation.addUndirectedEdge(1,2,2);
//        graphImplementation.addUndirectedEdge(1,5,3);
//        graphImplementation.addUndirectedEdge(2,3,4);
//        graphImplementation.addUndirectedEdge(2,4,2);
//        graphImplementation.addUndirectedEdge(5,4,3);
//        graphImplementation.addUndirectedEdge(5,6,8);
//        graphImplementation.addUndirectedEdge(3,7,9);
//        graphImplementation.addUndirectedEdge(4,7,5);
//        graphImplementation.addUndirectedEdge(6,7,12);
//        graphImplementation.addUndirectedEdge(3,4,1);
//
//        graphImplementation.printGraph();

        GraphImplementation<Integer> test = new GraphImplementation<>();
        test.addCoordinateUnDirectedEdge(-5,5,4,-5,1);
        test.addCoordinateUnDirectedEdge(-5,5,3,2,2);
        test.addCoordinateUnDirectedEdge(-5,5,-4,-4,3);
        test.addCoordinateUnDirectedEdge(3,2,-4,-4,4);
        test.addCoordinateUnDirectedEdge(3,2,4,-5,5);
        test.addCoordinateUnDirectedEdge(4,-5,-4,-4,6);

        test.printCoordinateGraph();


       }
}
