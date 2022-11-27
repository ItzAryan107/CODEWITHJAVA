package OOPS;

public class T075_NestedClass03 {
    public void print(){
        System.out.println("print() method of outer class!");

        class Inner{
            public void main(String[]args){
                System.out.println("main(){This main is non-static, bcz the Inner class is Non-static in which this main method is}" +
                        " method of Inner class");
                System.out.println(args);
            }
        }// The Object Of this class should be in the method, in which this class is
        Inner inner=new Inner();
        String[]args= {"Aryan","Pallavi","Arvi"};
        inner.main(args);
    }
}
class Aryan{
    public static void main(String[] args) {
        T075_NestedClass03 t75_nestedClass_03=new T075_NestedClass03();
        t75_nestedClass_03.print();
    }
}