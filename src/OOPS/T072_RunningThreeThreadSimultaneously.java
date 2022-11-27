package OOPS;

import java.util.Scanner;
/*
Write a program, Which can run three-thread simultaneously.
One thread will find max element, one thread will find mid element  and another thread will find the odd
min element from the same array
Make sure the main thread finishes last
 */
class MaxThread_001 extends Thread{
    int[] arr;
    Thread t;
    MaxThread_001(int []arr){
        this.arr=arr;
        t=new Thread(this,"Finding Max Number");
        t.start();
    }
    public void run(){
        System.out.println("Max Element Among them ---> "+findMaxElement(this.arr));
        System.out.println(Thread.currentThread().getName());
    }
    public int findMaxElement(int[] arr){
        int big=0;
        for (int j : arr) {
            if (big < j)
                big = j;
        }
        return big;
    }
}

class OddThread_002 extends Thread{
    int[] arr;
    Thread t;
    OddThread_002(int []arr){
        this.arr=arr;
        t=new Thread(this,"Finding minimum odd number in Array");
        t.start();
    }
    public void run(){
        System.out.println("Minimum Odd number in ur given List ---> "+oddMin(this.arr));
        System.out.println(Thread.currentThread().getName());
    }

    public int oddMin(int[] arr){
        int small=0;
        for (int j : arr) {
            if (j % 2 != 0) {
                small = j;
                break;
            }
        }
        for (int i=1;i<arr.length;i++){
            if (arr[i]%2!=0){
                if (small>arr[i]){
                    small=arr[i];
                }
            }
        }
        return small;
    }
}

class MidThread_003 extends Thread{
    int[] arr;
    Thread t;
    MidThread_003(int []arr){
        this.arr=arr;
        t=new Thread(this,"Finding mid element of Array");
        t.start();
    }

    @Override
    public void run(){
        System.out.println("Middle Term ---> "+findMid(this.arr));
        System.out.println(Thread.currentThread().getName());
    }

    public int findMid(int[] arr){
        int a=arr.length/2;
        if (arr.length%2==0)
            return arr[a-1];
        else
            return arr[a];
    }
}
public class T072_RunningThreeThreadSimultaneously {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number of Element you want ---> ");
        int no= sc.nextInt();
        System.out.println("Enter All Element --->");
        int[] element=new int[no];
        for (int i=0;i<no;i++){
            element[i]= sc.nextInt();
        }
        MaxThread_001 maxThread_001=new MaxThread_001(element);
        OddThread_002 oddThread_002=new OddThread_002(element);
        MidThread_003 midThread_003=new MidThread_003(element);
        try {//still it will compile the threads random, but the main thread will get finish last
            maxThread_001.t.join();
            oddThread_002.t.join();
            midThread_003.t.join();
        }catch (InterruptedException e){
            System.out.println("Error!");
        }

        System.out.println();
        System.out.println("This is the main Thread!!");
    }
}