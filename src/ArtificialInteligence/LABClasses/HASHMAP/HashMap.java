package ArtificialInteligence.LABClasses.HASHMAP;

public class HashMap<key, value> {

    public HashMapNode<key,value> head;

    public void put(key key,value value){
        if (head == null){
            head = new HashMapNode<>(key,value);
            return;
        }

        HashMapNode<key,value> currentNode = head;
        HashMapNode<key, value> previousNode = null;

        while (currentNode!=null){
            if (currentNode.key == key)
                return;
            previousNode = currentNode;
            currentNode = currentNode.next;
        }

        previousNode.next = new HashMapNode<>(key,value);
    }

    private boolean containsKey(HashMapNode<key,value> currentNode, key key){
        if (currentNode == null)
            return false;

        if (currentNode.key == key)
            return true;

        return containsKey(currentNode.next,key);
    }

    public boolean containsKey(key key){
        return containsKey(head,key);
    }


    public boolean containsValue(value value){
        return containsValue(head,value);
    }

    private boolean containsValue(HashMapNode<key,value> currentNode, value value){
        if (currentNode == null)
            return false;

        if (currentNode.value == value)
            return true;

        return containsValue(currentNode.next,value);
    }

    public key getKey(value value){
        HashMapNode<key,value> currentNode = head;

        while (currentNode!=null){
            if (currentNode.value == value)
                return currentNode.key;
            currentNode = currentNode.next;
        }

        return null;
    }

    public value getValue(key key){
        HashMapNode<key,value> currentNode = head;

        while (currentNode!=null){

            if (currentNode.key == key)
                return currentNode.value;

            currentNode = currentNode.next;
        }

        return null;
    }


    public void print(){
        System.out.print("{");
        if (head != null){
            HashMapNode<key,value> currentNode = head;
            while (currentNode.next!=null){
                System.out.print(currentNode.key+"="+currentNode.value+", ");
                currentNode = currentNode.next;
            }
            System.out.print(currentNode.key+"="+currentNode.value);
        }
        System.out.println("}");
    }
}
