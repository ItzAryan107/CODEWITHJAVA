package OOPS;

/*Daemon thread in Java is a low-priority thread that runs
in the background to perform tasks such as garbage collection.
Daemon thread in Java is also a service provider thread that
provides services to the user thread.
Its life depends on the mercy of user threads i.e.
when all the user threads die, JVM terminates this thread automatically.
Example of Daemon Thread in Java: Garbage collection in Java (gc), finalizer, etc.
Properties of Java Daemon Thread
They can not prevent the JVM from exiting when all the user threads
finish their execution.
JVM terminates itself when all user threads finish their execution.
If JVM finds a running daemon thread, it terminates the thread and,
after that, shutdown it. JVM does not care whether the Daemon thread
is running or not.
It is an utmost low priority thread.
setDaemon(boolean) --> false--> user thread runs even after main thread
                        true--> user thread will be closed
						when main thread is dead*/
class DemoT10 extends Thread{
    int i=0;
    DemoT10(String s){
        super(s);
        setDaemon(true);
        start();
    }
    public void run(){

        while(true){
            System.out.println("User thread is still working"+i);
            i++;
            try{
                sleep(250);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}
public class T073_Daemon{
    public static void main(String args[]){
        DemoT10 t1=new DemoT10("one");//after execution of this statement a new user thread will start running
        try{
            Thread.sleep(2500);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        if(t1.isAlive())
            System.out.println(t1.getName()+" is still alive");
        System.out.println("main thread is exiting...");
    }
}