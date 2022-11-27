package OOPS;

class NameRunnable_T71 implements Runnable{
    @Override
    public void run(){
        for (int i=1;i<=400000000;i++){
            System.out.println("Run by '"+Thread.currentThread().getName()+"'snd its position is ---> "+i);
        }
    }
}
public class T072_ThreadConceptSunJava {
    public static void main(String[] args){
        NameRunnable_T71 nameRunnable_t71=new NameRunnable_T71();
        Thread t1=new Thread(nameRunnable_t71);
        Thread t2=new Thread(nameRunnable_t71);
        Thread t3=new Thread(nameRunnable_t71);
        t1.setName("Aryan");
        t2.setName("Ashmit");
        t3.setName("Dharamendra");
        t1.start();
        t2.start();
        t3.start();
//        t1.start();
        /*
        A thread is done being a thread when its target run() method completes.
        Once a thread has been started, it can never be started again.
        Only a new thread can be started, and only once. A runnable
        thread or a dead thread cannot be restarted.
         */
    }
}
