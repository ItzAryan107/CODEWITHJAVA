package OOPS;

class MyThreadRunnable_01 implements Runnable{
    @Override
    public void run(){
        for (int i =0;i<504853;i++) {
            System.out.println("I am run() method of MyThreadRunnable_01 class!");
            aryan();
        }
    }
    private void aryan(){
        System.out.println("Aryan");
    }
}

class MyThreadRunnable_02 implements Runnable{
    @Override
    public void run(){
        for (int j=0;j<73687647;j++) {
            System.out.println("I am run() method of MyThreadRunnable_02 class!");
            ashmit();
        }
    }
    private void ashmit(){
        System.out.println("Ashmit");
    }
}
public class T072_ThreadUsingRunnableInterface {
    public static void main(String[] args) {
        //Second way to make Thread
        //new(Keyword) mtlb --> object ka banana, jo abhi bana h start nhi hua ha
        MyThreadRunnable_01 myThreadRunnable_01=new MyThreadRunnable_01();
        Thread object_01=new Thread(myThreadRunnable_01);
        MyThreadRunnable_02 myThreadRunnable_02=new MyThreadRunnable_02();
        Thread object_02=new Thread(myThreadRunnable_02);

        new Thread(myThreadRunnable_01).start(); //new way to call Runnable method
        object_02.start();
    }
}