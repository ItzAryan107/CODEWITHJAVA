package DataStructureAndAlgorithum.VITAP.THEORYClasses;

public class BinarySearchTreeBuiltHavingIntegerData {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    Node root;

    private void treeBuilt(int data, Node rootNode){
        if (rootNode == null){
            root = new Node(data);
            return;
        }

        if (data == rootNode.data)
            return;

        if (data<rootNode.data) {
            if (rootNode.left == null){
                rootNode.left = new Node(data);
                return;
            }
            treeBuilt(data,rootNode.left);
        }

        if (data> rootNode.data) {
            if (rootNode.right == null) {
                rootNode.right = new Node(data);
                return;
            }
            treeBuilt(data, rootNode.right);
        }
    }

    public void treeBuilt(int data){
        treeBuilt(data,root);
    }

    private void display(Node root){
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
        BinarySearchTreeBuiltHavingIntegerData binarySearchTreeBuilt = new BinarySearchTreeBuiltHavingIntegerData();
        binarySearchTreeBuilt.treeBuilt(30);
        binarySearchTreeBuilt.treeBuilt(10);
        binarySearchTreeBuilt.treeBuilt(40);
        binarySearchTreeBuilt.treeBuilt(8);
        binarySearchTreeBuilt.treeBuilt(9);
        binarySearchTreeBuilt.treeBuilt(5);
        binarySearchTreeBuilt.treeBuilt(2);
        binarySearchTreeBuilt.treeBuilt(7);
        binarySearchTreeBuilt.treeBuilt(39);
        binarySearchTreeBuilt.treeBuilt(49);
        binarySearchTreeBuilt.treeBuilt(30);
        binarySearchTreeBuilt.treeBuilt(4);
        binarySearchTreeBuilt.display();

    }
}
