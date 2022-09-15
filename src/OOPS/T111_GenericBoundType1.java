package OOPS;

class AGeneric{
    public void print(){
        System.out.println("This is AGeneric Class!");
    }
}

class BGeneric extends AGeneric{
    @Override
    public void print(){
        System.out.println("This is BGeneric Class which extends AGeneric");
    }
}

class CGeneric extends AGeneric{
    @Override
    public void print() {
        System.out.println("This is CGeneric which extends AGeneric");
    }
}

class Bound<T extends AGeneric>{// T can be BGeneric or CGeneric , bcz these two are only the children class of AGeneric
    private T t;
    Bound(T t){
        this.t=t;
    }
    public void call(){
        this.t.print();
    }
}
public class T111_GenericBoundType1 {
    public static void main(String[] args) {
        Bound<BGeneric>bound01=new Bound<>(new BGeneric());
        bound01.call();
        System.out.println();
        Bound<AGeneric>bound02=new Bound<>(new CGeneric());
        bound02.call();
    }
}
