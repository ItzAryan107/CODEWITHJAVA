package DataStructureAndAlgorithum.Tree.BinarySearchTree.GenericBinarSearchTree;

public class Node<P> {
    P data;
    Node<P> left;
    Node<P> right;

    Node(P data){
        this.data = data;
        left = null;
        right = null;
    }
}
