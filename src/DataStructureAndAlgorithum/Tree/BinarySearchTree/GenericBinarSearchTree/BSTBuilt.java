package DataStructureAndAlgorithum.Tree.BinarySearchTree.GenericBinarSearchTree;

public class BSTBuilt<P extends Number> {
    Node<P> root;

    private void treeBuilt(P data, Node<P> root){
        if (root.data.equals(data))
            return;

        if (data.doubleValue()<root.data.doubleValue()){
            if (root.left == null){
                root.left = new Node<>(data);
                return;
            }
            treeBuilt(data,root.left);
        }

        if (data.doubleValue()>root.data.doubleValue()){
            if (root.right == null){
                root.right = new Node<>(data);
                return;
            }
            treeBuilt(data,root.right);
        }
    }

    public void treeBuilt(P data){
        if (root == null){
            root = new Node<>(data);
            return;
        }

        treeBuilt(data,root);
    }
}
