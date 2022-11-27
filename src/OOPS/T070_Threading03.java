package OOPS;

class DemoT2 implements Runnable{
    Thread t1;
    DemoT2(int t){
        String s1=""+t;
        t1=new Thread(this,s1);//Thread(instance, String),
        //Second argument fixes the thread name
        t1.start();
    }
    public void run(){//this method can call other methods of DemoT2
        //we can provide some fragment of program
        for(int i=0;i<=5;i++)
            System.out.println("child-"+t1.getName()+","+i);
    }
}
public class T070_Threading03 {
    public static void main(String []args){

        DemoT2 ob1=new DemoT2(1);
        DemoT2 ob2=new DemoT2(2);
        for(int i=0;i<=5;i++)
            System.out.println("Using main thread"+i);
    }
}