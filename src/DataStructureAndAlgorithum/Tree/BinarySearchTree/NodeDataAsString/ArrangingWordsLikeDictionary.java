package DataStructureAndAlgorithum.Tree.BinarySearchTree.NodeDataAsString;


public class ArrangingWordsLikeDictionary {
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
        ArrangingWordsLikeDictionary arrangingWordsLikeDictionary = new ArrangingWordsLikeDictionary();
        arrangingWordsLikeDictionary.treeBuilt("HAT");
        arrangingWordsLikeDictionary.treeBuilt("HATE");
        arrangingWordsLikeDictionary.treeBuilt("AATREAN");
        arrangingWordsLikeDictionary.treeBuilt("AAT");
        arrangingWordsLikeDictionary.treeBuilt("SAT");
        arrangingWordsLikeDictionary.treeBuilt("SAT");
        arrangingWordsLikeDictionary.treeBuilt("ZAT");
        arrangingWordsLikeDictionary.treeBuilt("CAT");
        arrangingWordsLikeDictionary.treeBuilt("PAT");
        arrangingWordsLikeDictionary.treeBuilt("MAT");
        arrangingWordsLikeDictionary.treeBuilt("FAT");
        arrangingWordsLikeDictionary.treeBuilt("JAT");
        arrangingWordsLikeDictionary.treeBuilt("MATERNAL");
        arrangingWordsLikeDictionary.treeBuilt("SATURDAY");
        arrangingWordsLikeDictionary.display();
    }
}
