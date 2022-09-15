package OOPS;

class Test_01<T>{//we can use any number of data type here
    T Obj;
    Test_01(T Obj){
        this.Obj=Obj;
    }

    public T getObject(){
        return this.Obj;
    }

    public int rn(){// we can add any type of method, which will be accessible by main class of another class
        return 47;
    }
}
public class T110_GenericClass01 {
    public static void main(String[] args) {
        System.out.println("The benefit of Generic type class is---> " +
                "we can use same class for multiple data type");

        System.out.println("Using generic CLass for Integer");
        Test_01<Integer>test_01=new Test_01<>(37633);
        System.out.println(test_01.getObject());

        System.out.println();

        System.out.println("Using generic class for String");
        Test_01<String>test_02=new Test_01<>("Aryan");
        System.out.println(test_02.getObject());
        System.out.println("We can even"+test_02.rn());
    }
}
