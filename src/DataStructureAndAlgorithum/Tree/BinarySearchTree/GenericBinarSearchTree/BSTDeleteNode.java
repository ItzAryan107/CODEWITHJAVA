package DataStructureAndAlgorithum.Tree.BinarySearchTree.GenericBinarSearchTree;

public class BSTDeleteNode<P extends Number> {

    Node<P> root;

    public Node<P> arrange(Node<P> rootLeft,Node<P> rootRight){
        if (rootRight.left == null){
            rootRight.left = rootLeft;
            return rootRight;
        }

        arrange(rootLeft,rootRight.left);
        return rootRight;
    }

    public P deleteNode(P data, Node<P> root){
        if (data.doubleValue()<root.data.doubleValue()){
            if (root.left == null)
                return null;
            if (root.left.data.equals(data)){
                P deletedData = root.left.data;
                if (root.left.left == null && root.left.right == null){
                    root.left = null;
                }else if (root.left.left == null)
                    root.left = root.left.right;
                else if (root.left.right == null)
                    root.left = root.left.left;
                else
                    root.left = arrange(root.left.left,root.left.right);
                return deletedData;
            }
            return deleteNode(data,root.left);
        }

        if (data.doubleValue()>root.data.doubleValue()){
            if (root.right == null)
                return null;
            if (root.right.data.equals(data)){
                P deletedData = root.right.data;
                if (root.right.right == null && root.right.left ==null)
                    root.right = null;
                else if (root.right.right == null)
                    root.right = root.right.left;
                else if (root.right.left == null)
                    root.right = root.right.right;
                else
                    root.right = arrange(root.right.left,root.right.right);

                return deletedData;
            }
            return deleteNode(data,root.right);
        }
        return null;
    }

    public P deleteNode(P data){
        if (root.data.equals(data)){
            P deletedData = root.data;
            root = arrange(root.left,root.right);
            return deletedData;
        }

        return deleteNode(data,root);
    }

    private void display(Node<P> root){
        if (root == null)
            return;

        display(root.left);
        System.out.println(root.data);
        display(root.right);
    }

    public void display(){
        display(root);
    }

    public static void main(String[] args) {
        BSTBuilt<Integer> bstBuilt = new BSTBuilt<>();
        bstBuilt.treeBuilt(50);
        bstBuilt.treeBuilt(23);
        bstBuilt.treeBuilt(67);
        bstBuilt.treeBuilt(21);
        bstBuilt.treeBuilt(89);
        bstBuilt.treeBuilt(45);
        bstBuilt.treeBuilt(78);
        bstBuilt.treeBuilt(2);
        bstBuilt.treeBuilt(90);
        bstBuilt.treeBuilt(1);
        bstBuilt.treeBuilt(95);
        bstBuilt.treeBuilt(5);
        bstBuilt.treeBuilt(85);
        bstBuilt.treeBuilt(10);
        bstBuilt.treeBuilt(70);
        bstBuilt.treeBuilt(35);
        bstBuilt.treeBuilt(55);
        BSTDeleteNode<Integer> bstDeleteNode = new BSTDeleteNode<>();
        bstDeleteNode.root = bstBuilt.root;
        bstDeleteNode.display();
        System.out.println();
        if (bstDeleteNode.deleteNode(2) == null)
            System.out.println("The element you want to delete is already not present in the tree!!");
        else
            System.out.println("Deleted Node ---> "+ 2);
        bstDeleteNode.display();
    }
}
