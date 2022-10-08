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

        int i = 0;
        try {

            while (data.charAt(i) == root.data.charAt(i))
                i++;

        }catch (Exception e){
            if (data.length()<root.data.length())
                data = data+" ";
            else
                root.data = root.data + " ";
        }

        if (data.charAt(i) < root.data.charAt(i)){
            data = data.replaceAll(" ","");
            root.data = root.data.replaceAll(" ","");
            if (root.left == null){
                root.left = new Node(data);
                return;
            }

            treeBuilt(data,root.left);
        }

        if (data.charAt(i) > root.data.charAt(i)){
            data = data.replaceAll(" ","");
            root.data = root.data.replaceAll(" ","");
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
        binarySearchTreeBuiltHavingStringData.treeBuilt("HATE");
        binarySearchTreeBuiltHavingStringData.treeBuilt("AATREAN");
        binarySearchTreeBuiltHavingStringData.treeBuilt("AAT");
        binarySearchTreeBuiltHavingStringData.treeBuilt("SAT");
        binarySearchTreeBuiltHavingStringData.treeBuilt("SAT");
        binarySearchTreeBuiltHavingStringData.treeBuilt("ZAT");
        binarySearchTreeBuiltHavingStringData.treeBuilt("CAT");
        binarySearchTreeBuiltHavingStringData.treeBuilt("PAT");
        binarySearchTreeBuiltHavingStringData.treeBuilt("MAT");
        binarySearchTreeBuiltHavingStringData.treeBuilt("FAT");
        binarySearchTreeBuiltHavingStringData.treeBuilt("JAT");
        binarySearchTreeBuiltHavingStringData.treeBuilt("MATERNAL");
        binarySearchTreeBuiltHavingStringData.treeBuilt("SATURDAY");
        binarySearchTreeBuiltHavingStringData.display();
    }
}
