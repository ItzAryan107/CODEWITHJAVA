package OOPS;


class DemoT12{
    int c=0;
    synchronized void inc(){
        //if not synchronized means that your method is not thread safe

        for(int i=0;i<10000;i++){
            System.out.println(c);
            c++;
        }



    }
    synchronized void dec(){
        //After Using Synchronized keyword ---> only one thread can use that particular method at a time
        //if t1 is working with this thread then t2 has to wait

        for(int i=0;i<10000;i++) {
            System.out.println(c);
            c--;
        }

    }
}
public class T073_SynchronizedKeyword{
    public static void main(String args[]){
        DemoT12 ob1=new DemoT12();
        Thread t1=new Thread(new Runnable(){
            public void run(){
                ob1.inc();
            }},"one");
        Thread t2=new Thread(new Runnable(){
            public void run(){
                ob1.dec();
            }},"two");
        t1.start();
        t2.start();
        /*
        if this will get comment off then also the same result we will have, bcz of synchronized keyword
        try{
            t1.join();
            t2.join();
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
         */
        System.out.println(ob1.c);
    }
}