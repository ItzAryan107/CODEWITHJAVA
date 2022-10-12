package DataStructureAndAlgorithum.VITAP.LABClasses;

import java.util.Scanner;

public class LC12_BST {
    LC10_BSTNode root;
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
    public LC10_BSTNode arrange(LC10_BSTNode rootLeft, LC10_BSTNode rootRight){
        if (rootRight.left == null){
            rootRight.left = rootLeft;
            return rootRight;
        }
        arrange(rootLeft,rootRight.left);
        return rootRight;
    }

    public int deleteNode(int data, LC10_BSTNode root){
        if (data<root.data){
            if (root.left == null)
                return -1;
            if (root.left.data == data){
                int deletedData = root.left.data;
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

        if (data>root.data){
            if (root.right == null)
                return -1;
            if (root.right.data == data){
                int deletedData = root.right.data;
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
        return -1;
    }

    public int deleteNode(int data){
        if (root.data == data){
            int deletedData = root.data;
            root = arrange(root.left,root.right);
            return deletedData;
        }

        return deleteNode(data,root);
    }

    private void BSTBuilt(LC10_BSTNode root, int data){

        if (root.data == data)
            return;

        if (data< root.data){
            if (root.left == null){
                root.left = new LC10_BSTNode(data);
                return;
            }
            BSTBuilt(root.left, data);
        }
        if (data> root.data){
            if (root.right == null){
                root.right = new LC10_BSTNode(data);
                return;
            }
            BSTBuilt(root.right,data);
        }
    }

    public void BSTBuilt(int data){
        if (root == null){
            root = new LC10_BSTNode(data);
            return;
        }
        BSTBuilt(root,data);
    }

    public boolean search(LC10_BSTNode root,int data){
        if (root == null)
            return false;

        if (root.data == data)
            return true;

        if (data< root.data)
            return search(root.left, data);

        return search(root.right,data);
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

    public void print(){
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
        System.out.println();
    }


    public void operation(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Element You want ---> ");
        int n = sc.nextInt();
        System.out.print("Enter Elements ---> ");
        for (int i = 0;i<n;i++)
            BSTBuilt(sc.nextInt());
        print();
        System.out.println();
        System.out.print("Enter Number of Element you want to delete ---> ");
        n = sc.nextInt();
        for (int i=0;i<n;i++)
            deleteNode(sc.nextInt());
        System.out.printf("After deletion of %d element",n);
        System.out.println("After Deletion ---> ");
        print();
        System.out.println();
        System.out.print("Enter The Number of element you want to search ---> ");
        n = sc.nextInt();
        for (int i = 0;i<n;i++){
            int value = sc.nextInt();
            if (search(root, value))
                System.out.printf("%d present in the tree",value);
            else
                System.out.printf("%d not present in the tree",value);
            System.out.println();
        }


    }
    public static void main(String[] args) {
        LC12_BST lc12_bst = new LC12_BST();
        lc12_bst.operation();
    }
}
