package OOPS;

class TestGeneric01<T>{
    T[]array;
    TestGeneric01(T[] array){
        this.array=array;
    }

    public void print(){
        for (T element:array){
            System.out.println(element);
        }
    }
}
public class T110_GenericClass05 {
    public static void main(String[] args) {
        Integer[] a={1,2,3,4,5,6,7,8,9,7,6,5};
        TestGeneric01<Integer>testGeneric01=new TestGeneric01<>(a);
        testGeneric01.print();
    }
}