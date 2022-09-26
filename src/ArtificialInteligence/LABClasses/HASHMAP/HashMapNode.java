package ArtificialInteligence.LABClasses.HASHMAP;

public class HashMapNode<key, value> {
    public key key;
    public value value;
    public HashMapNode<key,value> next;

    public HashMapNode(key key, value value){
        this.key = key;
        this.value = value;
        next = null;
    }
}
