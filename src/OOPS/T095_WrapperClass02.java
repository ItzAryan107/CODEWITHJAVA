package OOPS;

public class T095_WrapperClass02 {
    public static void main(String[] args) {
        // creating object type int primitive type --->unboxing
        //First way --->
        Integer aObj=Integer.valueOf(2);
        int a=aObj;
        Double bObj=Double.valueOf(4.5);
        double b=bObj;

        System.out.println("Object into primitive ---> ");
        System.out.println("a ---> "+a);
        System.out.println("b ---> "+b);

        System.out.println();

        //Second Way ---> long way
        int c=aObj.intValue();
        double d=bObj.doubleValue();
    }
}