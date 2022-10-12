package DataStructureAndAlgorithum.VITAP.LABClasses;

import java.util.Scanner;

public class LC10_BSTBuilt {

    private LC10_BSTNode root;
    private void treeBuilt(LC10_BSTNode root, int data){
        if (root.data == data)
            return;

        if (data< root.data) {
            if (root.left == null){
                root.left = new LC10_BSTNode(data);
                return;
            }
            treeBuilt(root.left, data);
        }else {
            if (root.right == null){
                root.right = new LC10_BSTNode(data);
                return;
            }
            treeBuilt(root.right,data);
        }
    }

    public void treeBuilt(int data){
        if (root == null) {
            root = new LC10_BSTNode(data);
            return;
        }

        treeBuilt(root,data);
    }

    private void displayInorder(LC10_BSTNode root){
        if (root == null)
            return;

        displayInorder(root.left);
        System.out.print(root.data+" ");
        displayInorder(root.right);
    }

    public void displayPreorder(LC10_BSTNode root){
        if (root == null)
            return;

        System.out.print(root.data+" ");
        displayPreorder(root.left);
        displayPreorder(root.right);
    }

    public void displayPostorder(LC10_BSTNode root){
        if (root == null)
            return;

        System.out.print(root.data+" ");
        displayPostorder(root.left);
        displayPostorder(root.right);
    }

    public void operation(){
        System.out.println("\t Enter Your name to exit");
        System.out.println();
        System.out.println("Enter Your N numbers of Data -->");
        try {
            while (true) {
                Scanner sc =new Scanner(System.in);
                treeBuilt(sc.nextInt());
            }
        }catch (Exception e){
            System.out.print("PreOrder ---> ");
            if (root == null)
                System.out.print("No data Entered!!");
            displayPreorder(root);
            System.out.println();
            System.out.println();
            System.out.print("InOrder ---> ");
            if (root == null)
                System.out.print("No data Entered!!");
            displayInorder(root);
            System.out.println();
            System.out.println();
            System.out.print("PostOrder ---> ");
            if (root == null)
                System.out.print("No data Entered!!");
            displayPostorder(root);
            System.out.println();
        }

    }

    public static void main(String[] args) {
        LC10_BSTBuilt lc10_bstBuilt = new LC10_BSTBuilt();
        lc10_bstBuilt.operation();
    }
}
