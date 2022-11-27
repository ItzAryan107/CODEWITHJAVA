package OOPS;

class ThreadMethod01 extends Thread{
    ThreadMethod01(String name){
        super(name);
    }
    public void run(){
        for (int i=0;i<9099;i++){
            System.out.println("This is '"+Thread.currentThread().getName()+"' Thread");
        }
    }
}

class ThreadMethod02 extends Thread{
    ThreadMethod02(String name){
        super(name);
    }
    public void run(){
        for (int i=0;i<9099;i++){
            System.out.println("Thank You '"+Thread.currentThread().getName()+"' Thread");
        }
    }
}
public class T075_ThreadJoinMethod {
    public static void main(String[] args) {
        ThreadMethod01 t1=new ThreadMethod01("Aryan");
        ThreadMethod02 t2=new ThreadMethod02("Pallavi");
        t1.start();
        //let if i want ki jab tk t1 khatam n hojye t2 start hi n ho
        //t1.join(); if i use it directly, it will show error for exception, therefor we need to
        //put join method in try catch block

        /**
         * join()  Method
         */
        try {
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}