package DSA.Graph;

import DSA.Graph.LinkedList.L01_Node;

import java.util.LinkedList;
import java.util.Queue;

public class G03_BfsTraversal<T> extends G02_GraphImplementation<T>{

    public void bfsTraversal(T data){// this works on two queues
        G01_Node<T> head = this.head;
        G01_Node<T> currentNode = this.head;

        do {
            if (currentNode.data == data){
                this.head = currentNode;
                break;
            }
            currentNode=currentNode.next;
        }while (currentNode!=head);

        if (currentNode.data!=data){
            System.out.println(data);
            return;
        }

        bfs(data);
        this.head=head;
    }

    private void bfs(T data){
        Queue<T> visitedQueue = new LinkedList<>();
        Queue<T> explorationQueue = new LinkedList<>();

        G01_Node<T> currentNode = head;

        explorationQueue.add(currentNode.data);
        visitedQueue.add(currentNode.data);
        T dataPeek;
        L01_Node<T> listCurrentNode;
        while (!explorationQueue.isEmpty()){

            //peeking out the top most element of the visitedQueue
            dataPeek = explorationQueue.peek();

            //finding the next data in the circular list
            if (isContain(dataPeek)) {
                while (currentNode.data != dataPeek)
                    currentNode = currentNode.next;
            }

            //checking whether the currentNode.data present in the visitedQueue or not, if not then adding that particular data to the vivitedQueue
            if (!visitedQueue.contains(currentNode.data))
                visitedQueue.add(currentNode.data);


            listCurrentNode = currentNode.list.head;

            //putting all the not-visted edges to the visistedList
            while (listCurrentNode!=null) {

                if (!visitedQueue.contains(listCurrentNode.data)) {
                    visitedQueue.add(listCurrentNode.data);
                    explorationQueue.add(listCurrentNode.data);
                }

                listCurrentNode=listCurrentNode.next;
            }

            System.out.println(explorationQueue.poll());
        }
    }


    public static void main(String[] args) {
        G03_BfsTraversal<Integer> g02_graphImplementation = new G03_BfsTraversal<>();

        g02_graphImplementation.addEdges(1,2);
        g02_graphImplementation.addEdges(1,3);
        g02_graphImplementation.addEdges(2,1);
        g02_graphImplementation.addEdges(2,4);
        g02_graphImplementation.addEdges(3,4);

        g02_graphImplementation.printGraph();

        g02_graphImplementation.bfsTraversal(2);
    }
}
