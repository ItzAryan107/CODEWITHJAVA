package DataStructureAndAlgorithum.Tree.BinaryTree;

public class T01_Node<N>{
    N data;
    T01_Node<N> left;
    T01_Node<N> right;

    T01_Node(N data){
        this.data=data;
        left=null;
        right=null;
    }
}