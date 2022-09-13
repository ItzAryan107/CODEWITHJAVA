package DSA.Graph;

import DSA.Graph.LinkedList.L01_Node;

import java.util.LinkedList;
import java.util.Stack;

public class G04_DfsTraversal<T> extends G02_GraphImplementation<T>{

    public void dfsTraversal(T data){
        LinkedList<T> visitedList = new LinkedList<>();
        Stack<T> explorationStack = new Stack<T>();

        explorationStack.add(data);
        visitedList.add(data);


        L01_Node<T> listCurrentNode;
        G01_Node<T> circularCurrentNode = head;
        T popedData;

        while (!explorationStack.isEmpty()){
            popedData = explorationStack.pop();

            //reaching to that node of circularList which contain that particular data
            while (true){
                if (circularCurrentNode.data == popedData)
                    break;
                circularCurrentNode = circularCurrentNode.next;
            }

            listCurrentNode = circularCurrentNode.list.head;

            while (listCurrentNode!=null){
                if (!visitedList.contains(listCurrentNode.data)) {
                    visitedList.add(listCurrentNode.data);
                    explorationStack.add(listCurrentNode.data);
                }
                listCurrentNode=listCurrentNode.next;
            }

            System.out.println(popedData);
        }
    }


    public void dfsRecursiveTraversal(T data, G01_Node<T> cirularHead, Stack<T> explorationStack, LinkedList<T> visitedList){
        if (!visitedList.contains(data)) {
            visitedList.add(data);
            explorationStack.add(data);
        }

        if (explorationStack.isEmpty())
            return;

        while (true) {
            if (cirularHead.data == data)
                break;
            cirularHead = cirularHead.next;
        }

        L01_Node<T> listCurrentNode = cirularHead.list.head;

        while (listCurrentNode!=null){
            if (!visitedList.contains(listCurrentNode.data)){
                visitedList.add(listCurrentNode.data);
                explorationStack.add(listCurrentNode.data);
            }
            listCurrentNode = listCurrentNode.next;
        }

        System.out.println(data);
        dfsRecursiveTraversal(explorationStack.pop(), cirularHead,explorationStack,visitedList);
    }

    public void dfsRecursiveTraversal(T data){
        LinkedList<T> visitedList = new LinkedList<>();
        Stack<T> explorationStack = new Stack<T>();
        dfsRecursiveTraversal(data,head,explorationStack,visitedList);
    }

    public static void main(String[] args) {
        G04_DfsTraversal<Integer> g04_dfsTraversal = new G04_DfsTraversal<>();

        g04_dfsTraversal.addUnDirectedEdges(1,2);
        g04_dfsTraversal.addUnDirectedEdges(1,3);
        g04_dfsTraversal.addUnDirectedEdges(2,4);
        g04_dfsTraversal.addUnDirectedEdges(2,5);
        g04_dfsTraversal.addUnDirectedEdges(5,3);
        g04_dfsTraversal.addUnDirectedEdges(6,3);

//        g04_dfsTraversal.addUnDirectedEdges(1,2);
//        g04_dfsTraversal.addUnDirectedEdges(2,4);
//        g04_dfsTraversal.addEdges(1,3);
//        g04_dfsTraversal.addEdges(3,6);
//        g04_dfsTraversal.addEdges(5,3);
//        g04_dfsTraversal.addEdges(2,5);

        g04_dfsTraversal.printGraph();

        g04_dfsTraversal.dfsRecursiveTraversal(5);
    }
}
