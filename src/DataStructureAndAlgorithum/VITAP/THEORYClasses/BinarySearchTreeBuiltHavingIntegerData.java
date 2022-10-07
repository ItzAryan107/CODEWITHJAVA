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

    public void treeBuilt(int data, Node root){
        if (data == root.data)
            return;

        if (data<root.data) {
            if (root.left == null){
                root.left = new Node(data);
                return;
            }
            treeBuilt(data,root.left);
        }

        if (data> root.data) {
            if (root.right == null) {
                root.right = new Node(data);
                return;
            }
            treeBuilt(data, root.right);
        }
    }

    public void treeBuilt(int data){
        if (root == null){
            root = new Node(data);
            return;
        }

        treeBuilt(data,root);
    }

    public void display(Node root){
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
