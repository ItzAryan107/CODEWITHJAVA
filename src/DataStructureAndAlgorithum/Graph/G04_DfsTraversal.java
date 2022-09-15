package DataStructureAndAlgorithum.Graph;

import DataStructureAndAlgorithum.Graph.LinkedList.L01_Node;

import java.util.LinkedList;
import java.util.Stack;

public class G04_DfsTraversal<T> extends G02_GraphImplementation<T>{

    public void dfsRecursiveTraversal(T data, G01_Node<T> circularHead, Stack<T> explorationStack, LinkedList<T> visitedList){

        explorationStack.pop();
        if (!visitedList.contains(data))
            visitedList.add(data);

        G01_Node<T> temp = circularHead;

        do {
            circularHead = circularHead.next;
        }while (circularHead.data != data && circularHead != temp);

        if (circularHead.data == data) {
            L01_Node<T> listCurrentNode = circularHead.list.head;

            while (listCurrentNode != null) {
                if (!visitedList.contains(listCurrentNode.data)) {
                    visitedList.add(listCurrentNode.data);
                    explorationStack.add(listCurrentNode.data);
                }
                listCurrentNode = listCurrentNode.next;
            }
        }

        if (explorationStack.isEmpty()) {
            System.out.print(data);
            return;
        }

        System.out.print(data+" ");

        dfsRecursiveTraversal(explorationStack.peek(), circularHead,explorationStack,visitedList);
    }

    public void dfsRecursiveTraversal(T data){
        LinkedList<T> visitedList = new LinkedList<>();
        Stack<T> explorationStack = new Stack<>();
        explorationStack.add(data);
        System.out.print("DFS-TRAVERSAL ---> [");
        dfsRecursiveTraversal(data, head, explorationStack, visitedList);
        System.out.println("]");
    }

    public static void main(String[] args) {
        G04_DfsTraversal<Integer> g04_dfsTraversal = new G04_DfsTraversal<>();

//        g04_dfsTraversal.addEdges(2,1);
//        g04_dfsTraversal.addUnDirectedEdges(1,3);
//        g04_dfsTraversal.addUnDirectedEdges(2,4);
//        g04_dfsTraversal.addEdges(2,5);
//        g04_dfsTraversal.addEdges(3,5);
//        g04_dfsTraversal.addUnDirectedEdges(6,3);

        g04_dfsTraversal.addUnDirectedEdges(1,2);
        g04_dfsTraversal.addUnDirectedEdges(2,4);
        g04_dfsTraversal.addEdges(1,3);
        g04_dfsTraversal.addEdges(3,6);
        g04_dfsTraversal.addEdges(5,3);
        g04_dfsTraversal.addEdges(5,5);
//        g04_dfsTraversal.addEdges(5,2);

        g04_dfsTraversal.printGraph();

        g04_dfsTraversal.dfsRecursiveTraversal(5);

    }
}
