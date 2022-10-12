package DataStructureAndAlgorithum.VITAP.LABClasses;

import java.util.*;

public class LC11_TreeBuilt {// it's a normal tree built, in preorder Traversal
    Scanner sc = new Scanner(System.in);
    Queue<LC10_BSTNode> queue;
    LC11_TreeBuilt(){
        queue = new ArrayDeque<>();
    }

    int i=1;
    LC10_BSTNode root;
    public void push(int data) {//This function is pushing data in level order
        LC10_BSTNode newNode = null;

        if (data!=-1){
            newNode=new LC10_BSTNode(data);
            queue.add(newNode);
        }

        if (root == null) {
            root = newNode;
            return;
        }
        if (!queue.isEmpty()) {
            if (i == 2) {
                queue.peek().right = newNode;
                queue.remove();
                i=1;
                return;
            }
            queue.peek().left = newNode;
            i=2;
        }else
            throw new EmptyStackException();
    }

    public void preorderPrint(LC10_BSTNode root){
        if (root == null)
            return;

        System.out.print(root.data+" ");
        preorderPrint(root.left);
        preorderPrint(root.right);
    }

    public void preorderPrint(){
        preorderPrint(root);
    }

    public void inorderPrint(LC10_BSTNode root){
        if (root == null)
            return;

        inorderPrint(root.left);
        System.out.print(root.data+" ");
        inorderPrint(root.right);
    }
    public void inorderPrint(){
        inorderPrint(root);
    }
    public void postorderPrint(LC10_BSTNode root){
        if (root == null)
            return;

        postorderPrint(root.left);
        postorderPrint(root.right);
        System.out.print(root.data+" ");
    }

    public void postorderPrint(){
        postorderPrint(root);
    }

    public void operation(){
        System.out.println("\nEnter N/n to exit the TreeBuilt");
        System.out.println();
        System.out.println("Enter your N number of data");
        try {
            while (true){
                push(sc.nextInt());
            }
        }catch (Exception e){
            System.out.print("Preorder ---> ");
            preorderPrint();
            System.out.println();
            System.out.println();
            System.out.print("Inorder ---> ");
            inorderPrint();
            System.out.println();
            System.out.println();
            System.out.print("Postorder ---> ");
            postorderPrint();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LC11_TreeBuilt twg_02PreorderTreeBuilt = new LC11_TreeBuilt();
        twg_02PreorderTreeBuilt.operation();
    }
}
