package OOPS;

import java.util.ArrayList;
import java.util.List;


public class T110_Generics01 {//Without Generic, we can store any type of Object
    public static void main(String[] args) {
        List list=new ArrayList();//this gonna store any type of Data type Object
        list.add(1);
        list.add("Aryan");
        list.add(3.8);
        list.add("3");
//        int a=(int)list.get(3);// it will show Run time error, as you are trying to store String in int
        // the above line will show class cast exception
        //by using generic we can increase the safety of Data type

        //using generic ---> which allows to store one type os object
        List<Integer>list1=new ArrayList<>();//it can show Compile time error, which can be resolved during compilation
        //which saves time
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1);
    }
}
