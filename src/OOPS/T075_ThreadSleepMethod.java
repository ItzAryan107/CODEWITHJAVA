package OOPS;

class ThreadMethod03 extends Thread{
    ThreadMethod03(String name){
        super(name);
    }
    public void run() {
        int b = 0;
        while (true) {
            System.out.println("This is '" + Thread.currentThread().getName() + "' Thread");
        }
    }
}

class ThreadMethod04 extends Thread{
    ThreadMethod04(String name){
        super(name);
    }
    public void run(){
        int b=0;
        while (true){
            System.out.println("Thank You '"+Thread.currentThread().getName()+"' Thread");
            b++;
            try {
                Thread.sleep(455);//it will make this thread sleep for 455 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class T075_ThreadSleepMethod {
    public static void main(String[] args) {
        // sleep() method

        // try more thread methods from internet
        ThreadMethod03 t1=new ThreadMethod03("Aryan");
        ThreadMethod04 t2=new ThreadMethod04("Ashmit");
        t1.start();
        t2.start();
    }
}