package DataStructureAndAlgorithum.VITAP.LABClasses;

import java.util.Scanner;

public class LC12_TreeBuiltRecursively {

    Scanner sc = new Scanner(System.in);
    public LC10_BSTNode pushRecursively(){
        int data = sc.nextInt();
        LC10_BSTNode root = new LC10_BSTNode(data);
        if (data == -1)
            return null;
        root.left = pushRecursively();
        root.right = pushRecursively();
        return root;
    }

    public void preorderPrint(LC10_BSTNode root){
        if (root == null)
            return;
        System.out.print(root.data+" ");
        preorderPrint(root.left);
        preorderPrint(root.right);
    }

    public void inorderPrint(LC10_BSTNode root){
        if (root == null)
            return;
        inorderPrint(root.left);
        System.out.print(root.data+" ");
        inorderPrint(root.right);
    }

    public void postorderPrint(LC10_BSTNode root){
        if (root == null)
            return;
        postorderPrint(root.left);
        postorderPrint(root.right);
        System.out.print(root.data+" ");
    }

    LC10_BSTNode root;
    public void operation(){
        System.out.println("\tBuilt The Tree Accordingly\n(use -1 to put left or right of root null, this will make the tree Preorder Traversal)");
        System.out.println();
        System.out.println("Enter your N number of data");
        root=pushRecursively();
        System.out.print("Preorder ---> ");
        preorderPrint(root);
        System.out.println();
        System.out.println();
        System.out.print("Inorder ---> ");
        inorderPrint(root);
        System.out.println();
        System.out.println();
        System.out.print("Postorder ---> ");
        postorderPrint(root);
        System.out.println();
    }

    public static void main(String[] args) {
        LC12_TreeBuiltRecursively lc12_treeBuiltRecursively= new LC12_TreeBuiltRecursively();
        lc12_treeBuiltRecursively.operation();
    }
}
