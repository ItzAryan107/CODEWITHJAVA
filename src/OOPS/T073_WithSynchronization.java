package OOPS;

class Counter2{
    int count=0;
    public synchronized void increment(){
        count++;
    }
}
public class T073_WithSynchronization {
    public static void main(String[] args) throws Exception{
        Counter2 counter2=new Counter2();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1;i<=1000;i++){
                    counter2.increment();
                }
            }
        });
        Thread t2=new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i=0;i<1000;i++){
                    counter2.increment();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(counter2.count);
        //it will always print 2000 bcz synchronized keyword is used, means only one thread can only use
        // the synchronized method at a time
    }
}