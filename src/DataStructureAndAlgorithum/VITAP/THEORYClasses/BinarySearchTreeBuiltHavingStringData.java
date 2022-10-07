package DataStructureAndAlgorithum.VITAP.THEORYClasses;


public class BinarySearchTreeBuiltHavingStringData {
    static class Node{
        String data;
        Node left;
        Node right;
        Node(String data){
            this.data = data;
            left = null;
            right =null;
        }
    }

    Node root;
    public void treeBuilt(String data, Node root){

        if (data.equals(root.data))
            return;

        if (data.charAt(0) < root.data.charAt(0)){
            if (root.left == null){
                root.left = new Node(data);
                return;
            }

            treeBuilt(data,root.left);
        }

        if (data.charAt(0) > root.data.charAt(0)){
            if (root.right == null){
                root.right = new Node(data);
                return;
            }
            treeBuilt(data,root.right);
        }
    }

    public void treeBuilt(String data){
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
        BinarySearchTreeBuiltHavingStringData binarySearchTreeBuiltHavingStringData = new BinarySearchTreeBuiltHavingStringData();
        binarySearchTreeBuiltHavingStringData.treeBuilt("HAT");
        binarySearchTreeBuiltHavingStringData.treeBuilt("MAT");
        binarySearchTreeBuiltHavingStringData.treeBuilt("SAT");
        binarySearchTreeBuiltHavingStringData.treeBuilt("ZAT");
        binarySearchTreeBuiltHavingStringData.treeBuilt("CAT");
        binarySearchTreeBuiltHavingStringData.treeBuilt("PAT");
        binarySearchTreeBuiltHavingStringData.treeBuilt("FAT");
        binarySearchTreeBuiltHavingStringData.treeBuilt("JAT");
        binarySearchTreeBuiltHavingStringData.display();
    }
}
