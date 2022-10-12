package DataStructureAndAlgorithum.Tree.BinarySearchTree.NodeDataAsInteger;

public class BSTBuilt {

    private Node root;
    private void treeBuilt(Node root, int data){
        if (root.data == data)
            return;

        if (data< root.data) {
            if (root.left == null){
                root.left = new Node(data);
                return;
            }
            treeBuilt(root.left, data);
        }else {
            if (root.right == null){
                root.right = new Node(data);
                return;
            }
            treeBuilt(root.right,data);
        }
    }

    public void treeBuilt(int data){
        if (root == null) {
            root = new Node(data);
            return;
        }

        treeBuilt(root,data);
    }
}
