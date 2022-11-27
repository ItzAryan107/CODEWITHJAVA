package OOPS;

class MyThreadConstructor_01 extends Thread{
    public MyThreadConstructor_01(String name){
        super(name);// yaha par super keyword use ho raha h, jo thread class
        // ke constructor ko call kr rha h, vo asa constructor hai jo uska khud ka hai
    }
    public void run(){
        System.out.println("Thank you!");
//        while (true){
//            System.out.println("I am  a Thread");
//        }
    }
}

class MyThreadConstructor_02 implements Runnable{
    //    public MyThreadConstructor_02(String name){
//
//    }
    @Override
    public void run(){
        System.out.println("I am run() method of MyThreadConstructor_02 class!");
        System.out.println("I am run() method of MyThreadConstructor_02 class!");
    }
}

class MyThreadConstructor_03 extends Thread{
    Runnable r;
    public MyThreadConstructor_03(Runnable r,String Name){
        super(Name);
        this.r=r;
    }
    @Override
    public void run(){
        Thread thread=new Thread(this.r);
        System.out.println(thread.getName());
        System.out.println(thread.getId());
        thread.start();
        System.out.println("Ashmit Aryan");
    }
}
public class T073_ThreadConstructor {
    public static void main(String[] args) {
        MyThreadConstructor_01 myThreadConstructor_01=new MyThreadConstructor_01("Aryan");
        myThreadConstructor_01.start();
        System.out.println("The Id of thread myThreadConstructor_01 is ---> "+myThreadConstructor_01.getId());// ---> .getId() method of Thread
        System.out.println("The name of Thread MyThreadConstructor_01 is ---> "+myThreadConstructor_01.getName());// ---> .getName() method of Thread
        System.out.println();

        MyThreadConstructor_01 myThreadConstructor_02=new MyThreadConstructor_01("Pallavi");
//        // we can use multiple threads
        myThreadConstructor_02.start();
        System.out.println("The Id of thread of myThreadConstructor_02 is ---> "+myThreadConstructor_02.getId());
        System.out.println("The Name of Thread of myThreadConstructor_02 is ---> "+myThreadConstructor_02.getName());
        System.out.println();

        MyThreadConstructor_02 myRunable=new MyThreadConstructor_02();
        Thread thread=new Thread(myRunable, "Aryan");// have default constructor with parameter Runnable and String
        thread.start();
        System.out.println("The name of Thread MyThreadConstructor_02 ---> "+thread.getName());
        System.out.println("The name of Thread MyThreadConstructor_02 ---> "+thread.getId());
        System.out.println();
        MyThreadConstructor_03 myThreadConstructor03=new MyThreadConstructor_03(myRunable,"Dharamendra");
        myThreadConstructor03.start();
        System.out.println("The Name of Thread MyThreadConstructor_03 ---> "+myThreadConstructor03.getName());
        System.out.println("The Id of thread MyThreadConstructor_03 ---> "+myThreadConstructor03.getId());


        /**
         * Thread Constructors(Commonly Used) --->
         * Thread()
         * Thread(String Name)
         * Thread(Runnable r)
         * Thread(Runnable r, String Name)
         **/
    }
}
// Link ---> https://www.netsurfingzone.com/core-java/thread-class-in-java/