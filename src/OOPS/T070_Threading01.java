package OOPS;

class MyThread1 extends Thread{
    @Override
    public void run(){
        while (true){
            System.out.println("My cooking Thread1 is Running");
            System.out.println("I am Happy!");
            System.out.println();
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        while (true){
            System.out.println("My Chatting Thread2 is Running");
            System.out.println("I am in Love!");
            System.out.println();
        }
    }
}
public class T070_Threading01 {
    public static void main(String[] args) {
        //First way to make Thread
        MyThread1 myThread1=new MyThread1();
        MyThread2 myThread2=new MyThread2();
        /*
        just after making object of MyThread1 and MyThread2
        if we run the java file, it will show nothing
        but Why??
        bcz till now we just created the object
        when we will call there methods then it will show something on the terminal window
         */

        // using start() method, as it will call methods internally, and manage the calling
        // of methods accordingly, like for some time cooking and for some time
        // chatting, which is visible in the terminal
        // window after stopping the infinite java program (means concurrency is happening), start() method is in thread.java file
        myThread1.start();
        myThread2.start();
    }
}