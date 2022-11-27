package OOPS;

//Multiple Inheritance
interface Printable {
    void print();
}

interface Showable {
    void show();
}

public class T054_InterfaceExample implements Printable,Showable {
    public void print() {
        System.out.println("Hello");
    }
    public void show() {
        System.out.println("Welcome");
    }

    public static void main(String[] args){
        T054_InterfaceExample obj = new T054_InterfaceExample();
        obj.print();
        obj.show();
    }
}