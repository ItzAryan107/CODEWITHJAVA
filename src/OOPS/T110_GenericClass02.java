package OOPS;

class Test_02<A,P>{
    A A;
    P P;
    Test_02(A A,P P){
        this.A=A;
        this.P=P;
    }

    public void print(){//method can also be generic
        System.out.println(A.getClass().getName()+" ---> "+A);
        System.out.println(P.getClass().getName()+" ---> "+P);
    }
}
public class T110_GenericClass02 {
    public static void main(String[] args) {
        Test_02<Integer,String>test_02=new Test_02<>(263,"Aryan");
        test_02.print();
    }
}
