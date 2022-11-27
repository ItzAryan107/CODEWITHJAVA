package OOPS;

import java.util.Scanner;
/*
Write a program, which can run two-thread simultaneously.
One thread will find even number and another thread will find odd number.
make sure the main thread ends last
 */

class Thread_01 extends Thread{
    int var;
    Thread t;
    Thread_01(int var){
        this.var=var;
        t=new Thread(this,"Even Number");
        t.start();
    }
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+"!\n"+this.var+" Is a Even Number ---> "+evenNumber(this.var));
        System.out.println();
    }
    public boolean evenNumber(int n){
        return n%2 == 0;
    }
}

class Thread_02 extends Thread{
    int var;
    Thread t;
    Thread_02(int var){
        this.var=var;
        t=new Thread(this,"Odd Numbers");
        t.start();
    }

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+"!\n"+this.var+" Is a Odd Number ---> "+oddNumber(this.var));
        System.out.println();
    }

    public boolean oddNumber(int n){
        return n%2 != 0;
    }
}
public class T072_RunningTwoThreadSimultaneously {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A Number ---> ");
        int a= sc.nextInt();
        System.out.print("Enter A New Number ---> ");
        int b= sc.nextInt();

        Thread_01 thread_01=new Thread_01(a);
        Thread_02 thread_02=new Thread_02(b);
        try {
            thread_01.t.join();
            thread_02.t.join();
        }catch (InterruptedException e){
            System.out.println("Interrupted Exception!!");
        }
        System.out.println("\tOdd & Even");
    }
}