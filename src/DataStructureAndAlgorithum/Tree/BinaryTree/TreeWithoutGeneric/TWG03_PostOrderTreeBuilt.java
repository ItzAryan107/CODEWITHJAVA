package DataStructureAndAlgorithum.Tree.BinaryTree.TreeWithoutGeneric;

import java.util.Scanner;

public class TWG03_PostOrderTreeBuilt {

    /**
     * it will first great node nad it will start filling the data in postorder traversal
     * 1 means to make a node
     * -1 means that the next node is null
     */

    Scanner sc = new Scanner(System.in);
    int data = 0;
    public TWG01_Node pushRecursively(){

        int n = sc.nextInt();
        if (n == -1)
            return null;
        TWG01_Node root = new TWG01_Node(data);
        if (n == 1)
            root.left = pushRecursively();

        root.right = pushRecursively();
        System.out.println("Enter Data ---> ");
        data = sc.nextInt();
        root.data = data;

        return root;
    }

    public void print(TWG01_Node root){
        if (root == null)
            return;

        print(root.left);
        print(root.right);
        System.out.println(root.data);
    }

    public static void main(String[] args) {
        TWG03_PostOrderTreeBuilt twg03_postOrderTreeBuilt = new TWG03_PostOrderTreeBuilt();
        TWG01_Node root = twg03_postOrderTreeBuilt.pushRecursively();
        twg03_postOrderTreeBuilt.print(root);
    }
}
