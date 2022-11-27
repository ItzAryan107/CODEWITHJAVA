package OOPS;

import java.util.Scanner;

public class T075_NestedClass02 {
    private int data;

    public void setData(int data) {
        this.data = data;
    }


    public int returnData() {
        return this.data + 1000;
    }

    class Inner_01 {// In static class we can call nonstatic main or nonstatic method
        private int ar=34;

        public void print() {// But A non-static class with non-static main Method can only access after having thr object of that non-static class
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number ---> ");
            T075_NestedClass02 t75_nestedClass_02 = new T075_NestedClass02();
            t75_nestedClass_02.setData(sc.nextInt());
            System.out.println(t75_nestedClass_02.returnData());
        }
    }
    //    class Inner_02{
//        public void main(String[] args) {
//            Inner_01 inner_01= new Inner_01();
//            inner_01.print();
//        }
//    }
    T075_NestedClass02(){
        Inner_01 inner_01=new Inner_01();
        System.out.println(inner_01.ar);
    }
}
class CallingT75_NestedClass_02{
    public static void main(String[] args) {
//        T75_NestedClass_02 t75_nestedClass_02=new T75_NestedClass_02(); ---> no need of this object bcz I already created this object
        // in inner class of T75_NestedClass_02 class
        T075_NestedClass02.Inner_01 inner_01=new T075_NestedClass02().new Inner_01();
        inner_01.print();
    }
}