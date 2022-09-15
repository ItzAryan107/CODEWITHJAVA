package DataStructureAndAlgorithum.Graph;

import DataStructureAndAlgorithum.Graph.LinkedList.L02_List;

public class G01_Node<T> {
    T data;
    L02_List<T> list;
    G01_Node<T> next;

    G01_Node(T data){
        this.data = data;
        list=new L02_List<>();
        next = null;
    }
}
