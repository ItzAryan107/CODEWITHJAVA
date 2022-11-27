package OOPS;


import java.util.Scanner;

public class T079_ErrorsDemo {

    public static void main(String[] args) {
        System.out.println("Logical Error!!");
        //Write a program to print prime number between 1 and 10
        System.out.println(2);
        for (int i=1;i<=10;i++){
            System.out.println(2+i+1);
        }// this give logical error ---> not printing the exact output what user wants

        System.out.println();
        System.out.println("RunTime Error!!");//also called as exception
        Scanner sc=new Scanner(System.in);
        System.out.print("---> ");
        while (true) {
            int k = sc.nextInt();

            // handling the division by zero Exception using try catch block
            // Exception got handle means ---> it will not throw any error, it will get
            // nicely terminate without interrupting other part of that particular java file
            try {
                System.out.println("Integer part of 1000 divided by k is ---> " + 1000 / k);
                System.out.println("Aryan");
                break;
            } catch (Exception a) {
                System.out.print(a + "\nEnter valid input ---> ");
                System.out.println();
            }
        }
        //can the above line throw error ---> YES!, But When ?
        // When ---> this is Ar-thematic Exception
        //it will throw exception, when 1000 id tried to divide by zero'0'
    }
}