package OOPS;

/*
How to create user threads in Java?
2ways to create threads in Java
1) BY implementing Runnable interface(public void run()
                                      must be implemented)
2) By extending Thread class (We must have to override
                              public void run())
There are four constructors available in Thread class
Thread()
Thread(Object of a class)//this version we use
                 only when we create thread by implementing Runable
Thread(Object of a class, String name)//this version we use
                  only when we create thread by implementing Runable
Thread(String name)
setName(String)--> fix the name of threads
getName()-->get the name of thread
setPriority(int)-->set the priority
getPriority()-->> to get the priority ofa thread
static Thread currentThread()--> returns reference of cuurent thread
static void sleep(long millisecs)-->it suspends current thread for specified amt. of time
*/
public class T070_Threading04{
    public static void main(String []args){
        Thread t1=Thread.currentThread();
        t1.setName("My Main Thread");
        t1.setPriority(7);
        System.out.println(t1);//it displays details of thread t1
    }
}