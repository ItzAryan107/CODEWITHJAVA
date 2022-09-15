package OOPS;

import java.util.ArrayList;

public class T110_GenericClass03 {
    static <T> void print(T element01, T element02){
        System.out.println("element01 ---> "+element01.getClass().getName()+" ---> "+element01);
        System.out.println("element02 ---> "+element02.getClass().getName()+" ---> "+element01);
    }

    public <T> Integer Sum(T el01, T ele02){
        return 5;
    }

    public static void main(String[] args) {
        T110_GenericClass03 t110_genericClass03=new T110_GenericClass03();
        System.out.println(t110_genericClass03.Sum("Aryan",73474));

        ArrayList<int[]> a=new ArrayList<>();// this can be possible
    }
}
