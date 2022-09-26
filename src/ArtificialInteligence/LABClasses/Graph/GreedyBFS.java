package ArtificialInteligence.LABClasses.Graph;

import ArtificialInteligence.LABClasses.HASHMAP.HashMapNode;
import java.util.LinkedList;

public class GreedyBFS<A extends Number> {

    GraphImplementation<A> graph = new GraphImplementation<>();
    LinkedList<CoordinateNode<A>> linkedList = new LinkedList<>();

    //calculating the distance between intermediate coordinate and goal coordinate
    public long heuristicFunction(CoordinateNode<A> a1, CoordinateNode<A> a2){
        return Math.round(Math.sqrt(Math.pow(a1.x.doubleValue()-a2.x.doubleValue(),2) + Math.pow(a1.y.doubleValue()-a2.y.doubleValue(),2)));
    }

    // isUsed to stop the back tracking
    public boolean isPresent(CoordinateNode<A> coordinateNode){
        for (CoordinateNode<A> aCoordinateNode : linkedList) {
            if (aCoordinateNode.x.equals(coordinateNode.x) && aCoordinateNode.y.equals(coordinateNode.y))
                return false;
        }
        return true;
    }

    //greedyBFS traversal
    public void greedyBfs(Node<CoordinateNode<A>> initialCoordinate, CoordinateNode<A> goalState){

        if (initialCoordinate.data.x.equals(goalState.x) && initialCoordinate.data.y.equals(goalState.y)){
            System.out.println("("+goalState.x+","+goalState.y+")");
            return;
        }

        //to avoid back tracking, keeping all those coordinate in a list which is already reached
        linkedList.add(initialCoordinate.data);

        //printing the path
        System.out.print("("+initialCoordinate.data.x+","+initialCoordinate.data.y+") -> ");


        HashMapNode<CoordinateNode<A>,Integer> currentHashNode = initialCoordinate.hashSet.head;
        CoordinateNode<A> pathNode;
        long small;

        //trying to avoid already visited coordinate and which is the head of hashMap
        while (true){
            if (isPresent(currentHashNode.key)){
                pathNode = currentHashNode.key;
                small = heuristicFunction(currentHashNode.key,goalState);
                break;
            }
            currentHashNode = currentHashNode.next;
        }

        //finding the coordinate with the lowest heuristic value and which is not already visited
        while (currentHashNode!=null){
            if (small>heuristicFunction(currentHashNode.key,goalState) && isPresent(currentHashNode.key)){
                small = heuristicFunction(currentHashNode.key,goalState);
                pathNode = currentHashNode.key;
            }
            currentHashNode = currentHashNode.next;
        }

        if (pathNode == null)
            return;

        //reaching to the pathNode
        Node<CoordinateNode<A>> currentGraphNode = initialCoordinate;
        do {
            if (currentGraphNode.data.x.equals(pathNode.x) && currentGraphNode.data.y.equals(pathNode.y))
                break;
            currentGraphNode = currentGraphNode.next;
        }while (currentGraphNode!=initialCoordinate);

        greedyBfs(currentGraphNode,goalState);
    }

    //finding the initial state
    public Node<CoordinateNode<A>> initialStateFind(CoordinateNode<A> initialState){
        if (graph.coordinateHead.data.x.equals(initialState.x) && graph.coordinateHead.data.y.equals(initialState.y))
            return graph.coordinateHead;

        Node<CoordinateNode<A>> currentNode = graph.coordinateHead;

        do {
            if (currentNode.data.x.equals(initialState.x)   && currentNode.data.y.equals(initialState.y)){
                return currentNode;
            }
            currentNode=currentNode.next;
        }while (currentNode!=graph.coordinateHead);

        return null;
    }


    public static void main(String[] args) {
        GreedyBFS<Integer> test = new GreedyBFS<>();

        test.graph.addCoordinateUnDirectedEdge(-5,5,-5,3,3);
        test.graph.addCoordinateUnDirectedEdge(-5,5,-2,0,7);
        test.graph.addCoordinateUnDirectedEdge(-2,0,6,6,6);
        test.graph.addCoordinateUnDirectedEdge(-4,-4,6,6,1);
        test.graph.addCoordinateUnDirectedEdge(-4,-4,-5,3,5);
        test.graph.printCoordinateGraph();

        CoordinateNode<Integer> initialState = new CoordinateNode<>(-5,5);
        CoordinateNode<Integer> goalState = new CoordinateNode<>(-4,-4);
        test.greedyBfs(test.initialStateFind(initialState),goalState);
    }
}
