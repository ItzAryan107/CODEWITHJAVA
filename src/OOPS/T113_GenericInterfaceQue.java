package OOPS;

interface Mathematics<T extends Number>{
    int powerOf(T t);
}

class PowerOFThree<T extends Number> implements Mathematics<T>{
    @Override
    public int powerOf(T i){
        return i.intValue()* i.intValue()* i.intValue();
    }
    public double powerOf1(T i){
        return i.doubleValue()*i.doubleValue()*i.doubleValue();
    }
}
public class T113_GenericInterfaceQue {
    static transient int anInt;
    public static void main(String[] args) {
        //transient is applicable only for variable, not applicable for methods & local variable
        //it is use for security purpose, transient keyword ignore the original value of variable, and set it
        //at default value, transient means not to serialize
        System.out.println(anInt);
        PowerOFThree<Integer>powerOFThree=new PowerOFThree<>();
        Integer a=Integer.valueOf(65);
        System.out.println(powerOFThree.powerOf(a));
        System.out.println(powerOFThree.powerOf1(a));
    }
}