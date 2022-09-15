package OOPS;


class TestGeneric02<T extends Number>{// here T can be(bcz these all are children class of number) --->
    // Integer,Short,Byte,Long,Float and Double(means bounded for Some
    // data Type only )
    private T t;
    TestGeneric02(T t){
        this.t=t;
    }
    public void print(){
        System.out.println(t.getClass().getName()+" ---> "+t);
    }
}
public class T111_GenericBoundType {
    public static void main(String[] args) {
        TestGeneric02<Float> testGeneric02 = new TestGeneric02<>(56.9f);
        testGeneric02.print();
    }
}