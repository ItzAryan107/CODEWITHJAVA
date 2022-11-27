package OOPS;

class Counter1{
    int count=0;
    public void increment(){
        count++;
    }
}
public class T073_WithoutSynchronization{
    public static void main(String[] args) throws  Exception{
        Counter1 counter1=new Counter1();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1;i<=1000;i++){
                    counter1.increment();
                }
            }
        });
        Thread t2=new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i=0;i<1000;i++){
                    counter1.increment();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(counter1.count);
        //this can print any number, even it can print 2000
        //as here no synchronized keyword is used, so it can be possible bot the thread call the counter at the same
        // time, and the increment gets one time only, therefore it may print any number less tha 200 or 2000
    }
}