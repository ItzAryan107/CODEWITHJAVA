package OOPS;


/**
 * A generic interface can be implemented by normal class or generic class
 */
interface AGenericInterface<T>{
    void m1(T t);
}
class BGenericClass<T> implements AGenericInterface<T>{
    public T obj;

    @Override
    public void  m1(T t){
        obj=t;
    }
}

class CGenericClass implements AGenericInterface<Integer>{
    public Integer obj;

    @Override
    public void m1(Integer t){
        obj=t;
    }
}
public class T113_GenericInterface {
    public static void main(String[] args) {

    }
}
